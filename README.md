# github-bot

用kotlin 构建的一个github bot项目

暴露一个http://host:port/bot接口 
只需配置github webhook 就可以操作github来进行

```
1.当有人来提交一个PR的时候,自动打上一个标签:waiting-for-review
2.如果有人review过代码他可以在评论中打一个/lgtm PR通过CI,则机器人执行自动合并
```
gradle打包
```
./gradlew bootJar
```
