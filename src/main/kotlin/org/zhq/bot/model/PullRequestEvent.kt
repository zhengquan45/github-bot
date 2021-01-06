package org.zhq.bot.model


import com.fasterxml.jackson.annotation.JsonProperty

data class PullRequestEvent(
    @JsonProperty("action")
    val action: String,
    @JsonProperty("number")
    val number: Int,
    @JsonProperty("pull_request")
    val pullRequest: PullRequest,
    @JsonProperty("repository")
    val repository: Repository,
    @JsonProperty("sender")
    val sender: Sender
) {
    data class PullRequest(
        @JsonProperty("active_lock_reason")
        val activeLockReason: Any,
        @JsonProperty("additions")
        val additions: Int,
        @JsonProperty("assignee")
        val assignee: Any,
        @JsonProperty("assignees")
        val assignees: List<Any>,
        @JsonProperty("author_association")
        val authorAssociation: String,
        @JsonProperty("base")
        val base: Base,
        @JsonProperty("body")
        val body: String,
        @JsonProperty("changed_files")
        val changedFiles: Int,
        @JsonProperty("closed_at")
        val closedAt: Any,
        @JsonProperty("comments")
        val comments: Int,
        @JsonProperty("comments_url")
        val commentsUrl: String,
        @JsonProperty("commits")
        val commits: Int,
        @JsonProperty("commits_url")
        val commitsUrl: String,
        @JsonProperty("created_at")
        val createdAt: String,
        @JsonProperty("deletions")
        val deletions: Int,
        @JsonProperty("diff_url")
        val diffUrl: String,
        @JsonProperty("draft")
        val draft: Boolean,
        @JsonProperty("head")
        val head: Head,
        @JsonProperty("html_url")
        val htmlUrl: String,
        @JsonProperty("id")
        val id: Int,
        @JsonProperty("issue_url")
        val issueUrl: String,
        @JsonProperty("labels")
        val labels: List<Any>,
        @JsonProperty("_links")
        val links: Links,
        @JsonProperty("locked")
        val locked: Boolean,
        @JsonProperty("maintainer_can_modify")
        val maintainerCanModify: Boolean,
        @JsonProperty("merge_commit_sha")
        val mergeCommitSha: Any,
        @JsonProperty("mergeable")
        val mergeable: Any,
        @JsonProperty("mergeable_state")
        val mergeableState: String,
        @JsonProperty("merged")
        val merged: Boolean,
        @JsonProperty("merged_at")
        val mergedAt: Any,
        @JsonProperty("merged_by")
        val mergedBy: Any,
        @JsonProperty("milestone")
        val milestone: Any,
        @JsonProperty("node_id")
        val nodeId: String,
        @JsonProperty("number")
        val number: Int,
        @JsonProperty("patch_url")
        val patchUrl: String,
        @JsonProperty("rebaseable")
        val rebaseable: Any,
        @JsonProperty("requested_reviewers")
        val requestedReviewers: List<Any>,
        @JsonProperty("requested_teams")
        val requestedTeams: List<Any>,
        @JsonProperty("review_comment_url")
        val reviewCommentUrl: String,
        @JsonProperty("review_comments")
        val reviewComments: Int,
        @JsonProperty("review_comments_url")
        val reviewCommentsUrl: String,
        @JsonProperty("state")
        val state: String,
        @JsonProperty("statuses_url")
        val statusesUrl: String,
        @JsonProperty("title")
        val title: String,
        @JsonProperty("updated_at")
        val updatedAt: String,
        @JsonProperty("url")
        val url: String,
        @JsonProperty("user")
        val user: User
    ) {
        data class Base(
            @JsonProperty("label")
            val label: String,
            @JsonProperty("ref")
            val ref: String,
            @JsonProperty("repo")
            val repo: Repo,
            @JsonProperty("sha")
            val sha: String,
            @JsonProperty("user")
            val user: User
        ) {
            data class Repo(
                @JsonProperty("allow_merge_commit")
                val allowMergeCommit: Boolean,
                @JsonProperty("allow_rebase_merge")
                val allowRebaseMerge: Boolean,
                @JsonProperty("allow_squash_merge")
                val allowSquashMerge: Boolean,
                @JsonProperty("archive_url")
                val archiveUrl: String,
                @JsonProperty("archived")
                val archived: Boolean,
                @JsonProperty("assignees_url")
                val assigneesUrl: String,
                @JsonProperty("blobs_url")
                val blobsUrl: String,
                @JsonProperty("branches_url")
                val branchesUrl: String,
                @JsonProperty("clone_url")
                val cloneUrl: String,
                @JsonProperty("collaborators_url")
                val collaboratorsUrl: String,
                @JsonProperty("comments_url")
                val commentsUrl: String,
                @JsonProperty("commits_url")
                val commitsUrl: String,
                @JsonProperty("compare_url")
                val compareUrl: String,
                @JsonProperty("contents_url")
                val contentsUrl: String,
                @JsonProperty("contributors_url")
                val contributorsUrl: String,
                @JsonProperty("created_at")
                val createdAt: String,
                @JsonProperty("default_branch")
                val defaultBranch: String,
                @JsonProperty("delete_branch_on_merge")
                val deleteBranchOnMerge: Boolean,
                @JsonProperty("deployments_url")
                val deploymentsUrl: String,
                @JsonProperty("description")
                val description: String,
                @JsonProperty("disabled")
                val disabled: Boolean,
                @JsonProperty("downloads_url")
                val downloadsUrl: String,
                @JsonProperty("events_url")
                val eventsUrl: String,
                @JsonProperty("fork")
                val fork: Boolean,
                @JsonProperty("forks")
                val forks: Int,
                @JsonProperty("forks_count")
                val forksCount: Int,
                @JsonProperty("forks_url")
                val forksUrl: String,
                @JsonProperty("full_name")
                val fullName: String,
                @JsonProperty("git_commits_url")
                val gitCommitsUrl: String,
                @JsonProperty("git_refs_url")
                val gitRefsUrl: String,
                @JsonProperty("git_tags_url")
                val gitTagsUrl: String,
                @JsonProperty("git_url")
                val gitUrl: String,
                @JsonProperty("has_downloads")
                val hasDownloads: Boolean,
                @JsonProperty("has_issues")
                val hasIssues: Boolean,
                @JsonProperty("has_pages")
                val hasPages: Boolean,
                @JsonProperty("has_projects")
                val hasProjects: Boolean,
                @JsonProperty("has_wiki")
                val hasWiki: Boolean,
                @JsonProperty("homepage")
                val homepage: Any,
                @JsonProperty("hooks_url")
                val hooksUrl: String,
                @JsonProperty("html_url")
                val htmlUrl: String,
                @JsonProperty("id")
                val id: Int,
                @JsonProperty("issue_comment_url")
                val issueCommentUrl: String,
                @JsonProperty("issue_events_url")
                val issueEventsUrl: String,
                @JsonProperty("issues_url")
                val issuesUrl: String,
                @JsonProperty("keys_url")
                val keysUrl: String,
                @JsonProperty("labels_url")
                val labelsUrl: String,
                @JsonProperty("language")
                val language: Any,
                @JsonProperty("languages_url")
                val languagesUrl: String,
                @JsonProperty("license")
                val license: Any,
                @JsonProperty("merges_url")
                val mergesUrl: String,
                @JsonProperty("milestones_url")
                val milestonesUrl: String,
                @JsonProperty("mirror_url")
                val mirrorUrl: Any,
                @JsonProperty("name")
                val name: String,
                @JsonProperty("node_id")
                val nodeId: String,
                @JsonProperty("notifications_url")
                val notificationsUrl: String,
                @JsonProperty("open_issues")
                val openIssues: Int,
                @JsonProperty("open_issues_count")
                val openIssuesCount: Int,
                @JsonProperty("owner")
                val owner: Owner,
                @JsonProperty("private")
                val `private`: Boolean,
                @JsonProperty("pulls_url")
                val pullsUrl: String,
                @JsonProperty("pushed_at")
                val pushedAt: String,
                @JsonProperty("releases_url")
                val releasesUrl: String,
                @JsonProperty("size")
                val size: Int,
                @JsonProperty("ssh_url")
                val sshUrl: String,
                @JsonProperty("stargazers_count")
                val stargazersCount: Int,
                @JsonProperty("stargazers_url")
                val stargazersUrl: String,
                @JsonProperty("statuses_url")
                val statusesUrl: String,
                @JsonProperty("subscribers_url")
                val subscribersUrl: String,
                @JsonProperty("subscription_url")
                val subscriptionUrl: String,
                @JsonProperty("svn_url")
                val svnUrl: String,
                @JsonProperty("tags_url")
                val tagsUrl: String,
                @JsonProperty("teams_url")
                val teamsUrl: String,
                @JsonProperty("trees_url")
                val treesUrl: String,
                @JsonProperty("updated_at")
                val updatedAt: String,
                @JsonProperty("url")
                val url: String,
                @JsonProperty("watchers")
                val watchers: Int,
                @JsonProperty("watchers_count")
                val watchersCount: Int
            ) {
                data class Owner(
                    @JsonProperty("avatar_url")
                    val avatarUrl: String,
                    @JsonProperty("events_url")
                    val eventsUrl: String,
                    @JsonProperty("followers_url")
                    val followersUrl: String,
                    @JsonProperty("following_url")
                    val followingUrl: String,
                    @JsonProperty("gists_url")
                    val gistsUrl: String,
                    @JsonProperty("gravatar_id")
                    val gravatarId: String,
                    @JsonProperty("html_url")
                    val htmlUrl: String,
                    @JsonProperty("id")
                    val id: Int,
                    @JsonProperty("login")
                    val login: String,
                    @JsonProperty("node_id")
                    val nodeId: String,
                    @JsonProperty("organizations_url")
                    val organizationsUrl: String,
                    @JsonProperty("received_events_url")
                    val receivedEventsUrl: String,
                    @JsonProperty("repos_url")
                    val reposUrl: String,
                    @JsonProperty("site_admin")
                    val siteAdmin: Boolean,
                    @JsonProperty("starred_url")
                    val starredUrl: String,
                    @JsonProperty("subscriptions_url")
                    val subscriptionsUrl: String,
                    @JsonProperty("type")
                    val type: String,
                    @JsonProperty("url")
                    val url: String
                )
            }

            data class User(
                @JsonProperty("avatar_url")
                val avatarUrl: String,
                @JsonProperty("events_url")
                val eventsUrl: String,
                @JsonProperty("followers_url")
                val followersUrl: String,
                @JsonProperty("following_url")
                val followingUrl: String,
                @JsonProperty("gists_url")
                val gistsUrl: String,
                @JsonProperty("gravatar_id")
                val gravatarId: String,
                @JsonProperty("html_url")
                val htmlUrl: String,
                @JsonProperty("id")
                val id: Int,
                @JsonProperty("login")
                val login: String,
                @JsonProperty("node_id")
                val nodeId: String,
                @JsonProperty("organizations_url")
                val organizationsUrl: String,
                @JsonProperty("received_events_url")
                val receivedEventsUrl: String,
                @JsonProperty("repos_url")
                val reposUrl: String,
                @JsonProperty("site_admin")
                val siteAdmin: Boolean,
                @JsonProperty("starred_url")
                val starredUrl: String,
                @JsonProperty("subscriptions_url")
                val subscriptionsUrl: String,
                @JsonProperty("type")
                val type: String,
                @JsonProperty("url")
                val url: String
            )
        }

        data class Head(
            @JsonProperty("label")
            val label: String,
            @JsonProperty("ref")
            val ref: String,
            @JsonProperty("repo")
            val repo: Repo,
            @JsonProperty("sha")
            val sha: String,
            @JsonProperty("user")
            val user: User
        ) {
            data class Repo(
                @JsonProperty("allow_merge_commit")
                val allowMergeCommit: Boolean,
                @JsonProperty("allow_rebase_merge")
                val allowRebaseMerge: Boolean,
                @JsonProperty("allow_squash_merge")
                val allowSquashMerge: Boolean,
                @JsonProperty("archive_url")
                val archiveUrl: String,
                @JsonProperty("archived")
                val archived: Boolean,
                @JsonProperty("assignees_url")
                val assigneesUrl: String,
                @JsonProperty("blobs_url")
                val blobsUrl: String,
                @JsonProperty("branches_url")
                val branchesUrl: String,
                @JsonProperty("clone_url")
                val cloneUrl: String,
                @JsonProperty("collaborators_url")
                val collaboratorsUrl: String,
                @JsonProperty("comments_url")
                val commentsUrl: String,
                @JsonProperty("commits_url")
                val commitsUrl: String,
                @JsonProperty("compare_url")
                val compareUrl: String,
                @JsonProperty("contents_url")
                val contentsUrl: String,
                @JsonProperty("contributors_url")
                val contributorsUrl: String,
                @JsonProperty("created_at")
                val createdAt: String,
                @JsonProperty("default_branch")
                val defaultBranch: String,
                @JsonProperty("delete_branch_on_merge")
                val deleteBranchOnMerge: Boolean,
                @JsonProperty("deployments_url")
                val deploymentsUrl: String,
                @JsonProperty("description")
                val description: String,
                @JsonProperty("disabled")
                val disabled: Boolean,
                @JsonProperty("downloads_url")
                val downloadsUrl: String,
                @JsonProperty("events_url")
                val eventsUrl: String,
                @JsonProperty("fork")
                val fork: Boolean,
                @JsonProperty("forks")
                val forks: Int,
                @JsonProperty("forks_count")
                val forksCount: Int,
                @JsonProperty("forks_url")
                val forksUrl: String,
                @JsonProperty("full_name")
                val fullName: String,
                @JsonProperty("git_commits_url")
                val gitCommitsUrl: String,
                @JsonProperty("git_refs_url")
                val gitRefsUrl: String,
                @JsonProperty("git_tags_url")
                val gitTagsUrl: String,
                @JsonProperty("git_url")
                val gitUrl: String,
                @JsonProperty("has_downloads")
                val hasDownloads: Boolean,
                @JsonProperty("has_issues")
                val hasIssues: Boolean,
                @JsonProperty("has_pages")
                val hasPages: Boolean,
                @JsonProperty("has_projects")
                val hasProjects: Boolean,
                @JsonProperty("has_wiki")
                val hasWiki: Boolean,
                @JsonProperty("homepage")
                val homepage: Any,
                @JsonProperty("hooks_url")
                val hooksUrl: String,
                @JsonProperty("html_url")
                val htmlUrl: String,
                @JsonProperty("id")
                val id: Int,
                @JsonProperty("issue_comment_url")
                val issueCommentUrl: String,
                @JsonProperty("issue_events_url")
                val issueEventsUrl: String,
                @JsonProperty("issues_url")
                val issuesUrl: String,
                @JsonProperty("keys_url")
                val keysUrl: String,
                @JsonProperty("labels_url")
                val labelsUrl: String,
                @JsonProperty("language")
                val language: Any,
                @JsonProperty("languages_url")
                val languagesUrl: String,
                @JsonProperty("license")
                val license: Any,
                @JsonProperty("merges_url")
                val mergesUrl: String,
                @JsonProperty("milestones_url")
                val milestonesUrl: String,
                @JsonProperty("mirror_url")
                val mirrorUrl: Any,
                @JsonProperty("name")
                val name: String,
                @JsonProperty("node_id")
                val nodeId: String,
                @JsonProperty("notifications_url")
                val notificationsUrl: String,
                @JsonProperty("open_issues")
                val openIssues: Int,
                @JsonProperty("open_issues_count")
                val openIssuesCount: Int,
                @JsonProperty("owner")
                val owner: Owner,
                @JsonProperty("private")
                val `private`: Boolean,
                @JsonProperty("pulls_url")
                val pullsUrl: String,
                @JsonProperty("pushed_at")
                val pushedAt: String,
                @JsonProperty("releases_url")
                val releasesUrl: String,
                @JsonProperty("size")
                val size: Int,
                @JsonProperty("ssh_url")
                val sshUrl: String,
                @JsonProperty("stargazers_count")
                val stargazersCount: Int,
                @JsonProperty("stargazers_url")
                val stargazersUrl: String,
                @JsonProperty("statuses_url")
                val statusesUrl: String,
                @JsonProperty("subscribers_url")
                val subscribersUrl: String,
                @JsonProperty("subscription_url")
                val subscriptionUrl: String,
                @JsonProperty("svn_url")
                val svnUrl: String,
                @JsonProperty("tags_url")
                val tagsUrl: String,
                @JsonProperty("teams_url")
                val teamsUrl: String,
                @JsonProperty("trees_url")
                val treesUrl: String,
                @JsonProperty("updated_at")
                val updatedAt: String,
                @JsonProperty("url")
                val url: String,
                @JsonProperty("watchers")
                val watchers: Int,
                @JsonProperty("watchers_count")
                val watchersCount: Int
            ) {
                data class Owner(
                    @JsonProperty("avatar_url")
                    val avatarUrl: String,
                    @JsonProperty("events_url")
                    val eventsUrl: String,
                    @JsonProperty("followers_url")
                    val followersUrl: String,
                    @JsonProperty("following_url")
                    val followingUrl: String,
                    @JsonProperty("gists_url")
                    val gistsUrl: String,
                    @JsonProperty("gravatar_id")
                    val gravatarId: String,
                    @JsonProperty("html_url")
                    val htmlUrl: String,
                    @JsonProperty("id")
                    val id: Int,
                    @JsonProperty("login")
                    val login: String,
                    @JsonProperty("node_id")
                    val nodeId: String,
                    @JsonProperty("organizations_url")
                    val organizationsUrl: String,
                    @JsonProperty("received_events_url")
                    val receivedEventsUrl: String,
                    @JsonProperty("repos_url")
                    val reposUrl: String,
                    @JsonProperty("site_admin")
                    val siteAdmin: Boolean,
                    @JsonProperty("starred_url")
                    val starredUrl: String,
                    @JsonProperty("subscriptions_url")
                    val subscriptionsUrl: String,
                    @JsonProperty("type")
                    val type: String,
                    @JsonProperty("url")
                    val url: String
                )
            }

            data class User(
                @JsonProperty("avatar_url")
                val avatarUrl: String,
                @JsonProperty("events_url")
                val eventsUrl: String,
                @JsonProperty("followers_url")
                val followersUrl: String,
                @JsonProperty("following_url")
                val followingUrl: String,
                @JsonProperty("gists_url")
                val gistsUrl: String,
                @JsonProperty("gravatar_id")
                val gravatarId: String,
                @JsonProperty("html_url")
                val htmlUrl: String,
                @JsonProperty("id")
                val id: Int,
                @JsonProperty("login")
                val login: String,
                @JsonProperty("node_id")
                val nodeId: String,
                @JsonProperty("organizations_url")
                val organizationsUrl: String,
                @JsonProperty("received_events_url")
                val receivedEventsUrl: String,
                @JsonProperty("repos_url")
                val reposUrl: String,
                @JsonProperty("site_admin")
                val siteAdmin: Boolean,
                @JsonProperty("starred_url")
                val starredUrl: String,
                @JsonProperty("subscriptions_url")
                val subscriptionsUrl: String,
                @JsonProperty("type")
                val type: String,
                @JsonProperty("url")
                val url: String
            )
        }

        data class Links(
            @JsonProperty("comments")
            val comments: Comments,
            @JsonProperty("commits")
            val commits: Commits,
            @JsonProperty("html")
            val html: Html,
            @JsonProperty("issue")
            val issue: Issue,
            @JsonProperty("review_comment")
            val reviewComment: ReviewComment,
            @JsonProperty("review_comments")
            val reviewComments: ReviewComments,
            @JsonProperty("self")
            val self: Self,
            @JsonProperty("statuses")
            val statuses: Statuses
        ) {
            data class Comments(
                @JsonProperty("href")
                val href: String
            )

            data class Commits(
                @JsonProperty("href")
                val href: String
            )

            data class Html(
                @JsonProperty("href")
                val href: String
            )

            data class Issue(
                @JsonProperty("href")
                val href: String
            )

            data class ReviewComment(
                @JsonProperty("href")
                val href: String
            )

            data class ReviewComments(
                @JsonProperty("href")
                val href: String
            )

            data class Self(
                @JsonProperty("href")
                val href: String
            )

            data class Statuses(
                @JsonProperty("href")
                val href: String
            )
        }

        data class User(
            @JsonProperty("avatar_url")
            val avatarUrl: String,
            @JsonProperty("events_url")
            val eventsUrl: String,
            @JsonProperty("followers_url")
            val followersUrl: String,
            @JsonProperty("following_url")
            val followingUrl: String,
            @JsonProperty("gists_url")
            val gistsUrl: String,
            @JsonProperty("gravatar_id")
            val gravatarId: String,
            @JsonProperty("html_url")
            val htmlUrl: String,
            @JsonProperty("id")
            val id: Int,
            @JsonProperty("login")
            val login: String,
            @JsonProperty("node_id")
            val nodeId: String,
            @JsonProperty("organizations_url")
            val organizationsUrl: String,
            @JsonProperty("received_events_url")
            val receivedEventsUrl: String,
            @JsonProperty("repos_url")
            val reposUrl: String,
            @JsonProperty("site_admin")
            val siteAdmin: Boolean,
            @JsonProperty("starred_url")
            val starredUrl: String,
            @JsonProperty("subscriptions_url")
            val subscriptionsUrl: String,
            @JsonProperty("type")
            val type: String,
            @JsonProperty("url")
            val url: String
        )
    }

    data class Repository(
        @JsonProperty("archive_url")
        val archiveUrl: String,
        @JsonProperty("archived")
        val archived: Boolean,
        @JsonProperty("assignees_url")
        val assigneesUrl: String,
        @JsonProperty("blobs_url")
        val blobsUrl: String,
        @JsonProperty("branches_url")
        val branchesUrl: String,
        @JsonProperty("clone_url")
        val cloneUrl: String,
        @JsonProperty("collaborators_url")
        val collaboratorsUrl: String,
        @JsonProperty("comments_url")
        val commentsUrl: String,
        @JsonProperty("commits_url")
        val commitsUrl: String,
        @JsonProperty("compare_url")
        val compareUrl: String,
        @JsonProperty("contents_url")
        val contentsUrl: String,
        @JsonProperty("contributors_url")
        val contributorsUrl: String,
        @JsonProperty("created_at")
        val createdAt: String,
        @JsonProperty("default_branch")
        val defaultBranch: String,
        @JsonProperty("deployments_url")
        val deploymentsUrl: String,
        @JsonProperty("description")
        val description: String,
        @JsonProperty("disabled")
        val disabled: Boolean,
        @JsonProperty("downloads_url")
        val downloadsUrl: String,
        @JsonProperty("events_url")
        val eventsUrl: String,
        @JsonProperty("fork")
        val fork: Boolean,
        @JsonProperty("forks")
        val forks: Int,
        @JsonProperty("forks_count")
        val forksCount: Int,
        @JsonProperty("forks_url")
        val forksUrl: String,
        @JsonProperty("full_name")
        val fullName: String,
        @JsonProperty("git_commits_url")
        val gitCommitsUrl: String,
        @JsonProperty("git_refs_url")
        val gitRefsUrl: String,
        @JsonProperty("git_tags_url")
        val gitTagsUrl: String,
        @JsonProperty("git_url")
        val gitUrl: String,
        @JsonProperty("has_downloads")
        val hasDownloads: Boolean,
        @JsonProperty("has_issues")
        val hasIssues: Boolean,
        @JsonProperty("has_pages")
        val hasPages: Boolean,
        @JsonProperty("has_projects")
        val hasProjects: Boolean,
        @JsonProperty("has_wiki")
        val hasWiki: Boolean,
        @JsonProperty("homepage")
        val homepage: Any,
        @JsonProperty("hooks_url")
        val hooksUrl: String,
        @JsonProperty("html_url")
        val htmlUrl: String,
        @JsonProperty("id")
        val id: Int,
        @JsonProperty("issue_comment_url")
        val issueCommentUrl: String,
        @JsonProperty("issue_events_url")
        val issueEventsUrl: String,
        @JsonProperty("issues_url")
        val issuesUrl: String,
        @JsonProperty("keys_url")
        val keysUrl: String,
        @JsonProperty("labels_url")
        val labelsUrl: String,
        @JsonProperty("language")
        val language: Any,
        @JsonProperty("languages_url")
        val languagesUrl: String,
        @JsonProperty("license")
        val license: Any,
        @JsonProperty("merges_url")
        val mergesUrl: String,
        @JsonProperty("milestones_url")
        val milestonesUrl: String,
        @JsonProperty("mirror_url")
        val mirrorUrl: Any,
        @JsonProperty("name")
        val name: String,
        @JsonProperty("node_id")
        val nodeId: String,
        @JsonProperty("notifications_url")
        val notificationsUrl: String,
        @JsonProperty("open_issues")
        val openIssues: Int,
        @JsonProperty("open_issues_count")
        val openIssuesCount: Int,
        @JsonProperty("owner")
        val owner: Owner,
        @JsonProperty("private")
        val `private`: Boolean,
        @JsonProperty("pulls_url")
        val pullsUrl: String,
        @JsonProperty("pushed_at")
        val pushedAt: String,
        @JsonProperty("releases_url")
        val releasesUrl: String,
        @JsonProperty("size")
        val size: Int,
        @JsonProperty("ssh_url")
        val sshUrl: String,
        @JsonProperty("stargazers_count")
        val stargazersCount: Int,
        @JsonProperty("stargazers_url")
        val stargazersUrl: String,
        @JsonProperty("statuses_url")
        val statusesUrl: String,
        @JsonProperty("subscribers_url")
        val subscribersUrl: String,
        @JsonProperty("subscription_url")
        val subscriptionUrl: String,
        @JsonProperty("svn_url")
        val svnUrl: String,
        @JsonProperty("tags_url")
        val tagsUrl: String,
        @JsonProperty("teams_url")
        val teamsUrl: String,
        @JsonProperty("trees_url")
        val treesUrl: String,
        @JsonProperty("updated_at")
        val updatedAt: String,
        @JsonProperty("url")
        val url: String,
        @JsonProperty("watchers")
        val watchers: Int,
        @JsonProperty("watchers_count")
        val watchersCount: Int
    ) {
        data class Owner(
            @JsonProperty("avatar_url")
            val avatarUrl: String,
            @JsonProperty("events_url")
            val eventsUrl: String,
            @JsonProperty("followers_url")
            val followersUrl: String,
            @JsonProperty("following_url")
            val followingUrl: String,
            @JsonProperty("gists_url")
            val gistsUrl: String,
            @JsonProperty("gravatar_id")
            val gravatarId: String,
            @JsonProperty("html_url")
            val htmlUrl: String,
            @JsonProperty("id")
            val id: Int,
            @JsonProperty("login")
            val login: String,
            @JsonProperty("node_id")
            val nodeId: String,
            @JsonProperty("organizations_url")
            val organizationsUrl: String,
            @JsonProperty("received_events_url")
            val receivedEventsUrl: String,
            @JsonProperty("repos_url")
            val reposUrl: String,
            @JsonProperty("site_admin")
            val siteAdmin: Boolean,
            @JsonProperty("starred_url")
            val starredUrl: String,
            @JsonProperty("subscriptions_url")
            val subscriptionsUrl: String,
            @JsonProperty("type")
            val type: String,
            @JsonProperty("url")
            val url: String
        )
    }

    data class Sender(
        @JsonProperty("avatar_url")
        val avatarUrl: String,
        @JsonProperty("events_url")
        val eventsUrl: String,
        @JsonProperty("followers_url")
        val followersUrl: String,
        @JsonProperty("following_url")
        val followingUrl: String,
        @JsonProperty("gists_url")
        val gistsUrl: String,
        @JsonProperty("gravatar_id")
        val gravatarId: String,
        @JsonProperty("html_url")
        val htmlUrl: String,
        @JsonProperty("id")
        val id: Int,
        @JsonProperty("login")
        val login: String,
        @JsonProperty("node_id")
        val nodeId: String,
        @JsonProperty("organizations_url")
        val organizationsUrl: String,
        @JsonProperty("received_events_url")
        val receivedEventsUrl: String,
        @JsonProperty("repos_url")
        val reposUrl: String,
        @JsonProperty("site_admin")
        val siteAdmin: Boolean,
        @JsonProperty("starred_url")
        val starredUrl: String,
        @JsonProperty("subscriptions_url")
        val subscriptionsUrl: String,
        @JsonProperty("type")
        val type: String,
        @JsonProperty("url")
        val url: String
    )
}