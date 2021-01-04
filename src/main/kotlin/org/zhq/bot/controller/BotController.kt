package org.zhq.bot.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class BotController {
    /**
     * 1.当有人来提交一个PR的时候,自动打上一个标签:waiting-for-review
     * 2.如果有人review过代码他可以在评论中打一个/lgtm PR通过CI,则机器人执行自动合并
     */

    @PostMapping("/bot")
    fun bot(@RequestBody body: String, request: HttpServletRequest): String {
        println(request.getHeader("X-Github-Event"))
        println(body)
        return "OK"
    }
}