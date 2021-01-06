package org.zhq.bot.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.postForObject
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
        val event = request.getHeader("X-Github-Event")
        if (event == "pull_request") {
            val pullRequestEvent = objectMapper.readValue(body, PullRequestEvent::class.java)
            if ("opened" == pullRequestEvent.action) {
                labelPullRequest(pullRequestEvent.repository.owner.login,
                        pullRequestEvent.repository.name, pullRequestEvent.number, "waiting-for-review")
            }
        } else {
            println("丢失不关心的事件");
        }
        return "OK"
    }

    fun labelPullRequest(owner: String, repo: String, issueNumber: Int, label: String) {
        val url = "https://api.github.com/repos/$owner/$repo/issues/$issueNumber/labels"
        val httpHeaders = HttpHeaders()
        httpHeaders["Accept"] = "application/vnd.github.v3+json"
        httpHeaders["Authorization"] = "token ${System.getenv("GITHUB_TOKEN")}"
        val params = mapOf("labels" to listOf(label))
        val httpEntity = HttpEntity(params, httpHeaders)
        val result = restTemplate.postForObject(url, httpEntity,String::class.java)
        println(result)
    }
}