package org.zhq.bot.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject
import org.springframework.web.client.postForObject
import org.zhq.bot.model.CommitStatus
import org.zhq.bot.model.IssueCommentEvent
import org.zhq.bot.model.PullRequest
import org.zhq.bot.model.PullRequestEvent
import javax.servlet.http.HttpServletRequest

@RestController
class BotController {
    /**
     * 1.当有人来提交一个PR的时候,自动打上一个标签:waiting-for-review
     * 2.如果有人review过代码他可以在评论中打一个/lgtm PR通过CI,则机器人执行自动合并
     */

    val objectMapper: ObjectMapper = ObjectMapper()

    val restTemplate: RestTemplate = RestTemplate()

    @PostMapping("/bot")
    fun bot(@RequestBody body: String, request: HttpServletRequest): String {
        println("body $body")
        when (request.getHeader("X-Github-Event")) {
            "pull_request" -> processPullRequestEvent(body)
            "issue_comment" -> processIssueCommentEvent(body)
            else -> println("丢失不关心的事件")
        }
        return "OK"
    }

    fun processIssueCommentEvent(body: String) {
        val issueCommentEvent = objectMapper.readValue<IssueCommentEvent>(body);
        if (issueCommentEvent.comment.body.contains("/lgtm")) {
            //检查CI是否通过执行合并
            val pullRequest = getPullRequest(
                    issueCommentEvent.repository.owner.login,
                    issueCommentEvent.repository.name,
                    issueCommentEvent.issue.number
            )
            val headCommit = pullRequest.head.sha
            val pass = isCIPassed(
                    issueCommentEvent.repository.owner.login,
                    issueCommentEvent.repository.name,
                    headCommit
            )
            if(pass){

            }else{
                //否则CI没有通过.等通过了我会自动合并,请首长放心
                publishIssueComment(
                        issueCommentEvent.repository.owner.login,
                        issueCommentEvent.repository.name,
                        issueCommentEvent.issue.number,
                        "CI没有通过.等通过了我会自动合并,请首长放心"
                )
            }

        } else {
            println("忽略和机器人无关的评论,不用管")
        }
    }

    fun processPullRequestEvent(body: String) {
        val pullRequestEvent = objectMapper.readValue<PullRequestEvent>(body)
        if ("opened" == pullRequestEvent.action) {
            labelPullRequest(
                    pullRequestEvent.repository.owner.login,
                    pullRequestEvent.repository.name,
                    pullRequestEvent.number,
                    "waiting-for-review")
        }
    }

    fun isCIPassed(owner: String, repo: String, commitId: String): Boolean {
        val commitStatuses = getCommitStatuses(owner, repo, commitId)
        return commitStatuses.isNotEmpty() && commitStatuses.all { it.state == "success" }
    }



    fun getCommitStatuses(owner: String, repo: String, commitId: String): List<CommitStatus> {
        val url = "https://api.github.com/repos/$owner/$repo/commits/$commitId/statuses"
        val githubToken = System.getenv("GITHUB_TOKEN")
        val headers = mapOf("Accept" to "application/vnd.github.v3+json", "Authorization" to "token $githubToken")
        val httpEntity = HttpEntity(headers)
        val result = restTemplate.getForObject<String>(url, httpEntity)
        return objectMapper.readValue(result)
    }

    fun getPullRequest(owner: String, repo: String, number: Int): PullRequest {
        val url = "https://api.github.com/repos/$owner/$repo/pulls/$number"
        val githubToken = System.getenv("GITHUB_TOKEN")
        val headers = mapOf("Accept" to "application/vnd.github.v3+json", "Authorization" to "token $githubToken")
        val httpEntity = HttpEntity(headers)
        val result = restTemplate.getForObject<String>(url, httpEntity)
        return objectMapper.readValue(result)
    }

    fun labelPullRequest(owner: String, repo: String, number: Int, label: String) {
        val url = "https://api.github.com/repos/$owner/$repo/issues/$number/labels"
        val httpHeaders = HttpHeaders()
        httpHeaders["Accept"] = "application/vnd.github.v3+json"
        val githubToken = System.getenv("GITHUB_TOKEN")
        httpHeaders["Authorization"] = "token $githubToken"
        val params = mapOf("labels" to listOf(label))
        val httpEntity = HttpEntity(params, httpHeaders)
        val result = restTemplate.postForObject<String>(url, httpEntity)
        println(result)
    }

    fun publishIssueComment(owner: String, repo: String, number: Int, body: String){
        val url = "https://api.github.com/repos/$owner/$repo/issues/$number/comments"
        val httpHeaders = HttpHeaders()
        httpHeaders["Accept"] = "application/vnd.github.v3+json"
        val githubToken = System.getenv("GITHUB_TOKEN")
        httpHeaders["Authorization"] = "token $githubToken"
        val params = mapOf("body" to body)
        val httpEntity = HttpEntity(params, httpHeaders)
        restTemplate.postForObject<String>(url, httpEntity)
    }
}