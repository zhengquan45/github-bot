package org.zhq.bot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PullRequest {

    private String url;
    private Integer id;
    private String node_id;
    private String html_url;
    private String diff_url;
    private String patch_url;
    private String issue_url;
    private String commits_url;
    private String review_comments_url;
    private String review_comment_url;
    private String comments_url;
    private String statuses_url;
    private Integer number;
    private String state;
    private Boolean locked;
    private String title;
    private User user;
    private String body;
    private Milestone milestone;
    private String active_lock_reason;
    private String created_at;
    private String updated_at;
    private String closed_at;
    private String merged_at;
    private String merge_commit_sha;
    private Assignee assignee;
    private Head head;
    private Base base;
    private Links _links;
    private String author_association;
    private Boolean draft;
    private Boolean merged;
    private Boolean mergeable;
    private Boolean rebaseable;
    private String mergeable_state;
    private MergedBy merged_by;
    private Integer comments;
    private Integer review_comments;
    private Boolean maintainer_can_modify;
    private Integer commits;
    private Integer additions;
    private Integer deletions;
    private Integer changed_files;
    private List<Labels> labels;
    private List<Assignees> assignees;
    private List<RequestedReviewers> requested_reviewers;
    private List<RequestedTeams> requested_teams;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDiff_url() {
        return diff_url;
    }

    public void setDiff_url(String diff_url) {
        this.diff_url = diff_url;
    }

    public String getPatch_url() {
        return patch_url;
    }

    public void setPatch_url(String patch_url) {
        this.patch_url = patch_url;
    }

    public String getIssue_url() {
        return issue_url;
    }

    public void setIssue_url(String issue_url) {
        this.issue_url = issue_url;
    }

    public String getCommits_url() {
        return commits_url;
    }

    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public String getReview_comments_url() {
        return review_comments_url;
    }

    public void setReview_comments_url(String review_comments_url) {
        this.review_comments_url = review_comments_url;
    }

    public String getReview_comment_url() {
        return review_comment_url;
    }

    public void setReview_comment_url(String review_comment_url) {
        this.review_comment_url = review_comment_url;
    }

    public String getComments_url() {
        return comments_url;
    }

    public void setComments_url(String comments_url) {
        this.comments_url = comments_url;
    }

    public String getStatuses_url() {
        return statuses_url;
    }

    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean isLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    public String getActive_lock_reason() {
        return active_lock_reason;
    }

    public void setActive_lock_reason(String active_lock_reason) {
        this.active_lock_reason = active_lock_reason;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    public String getMerged_at() {
        return merged_at;
    }

    public void setMerged_at(String merged_at) {
        this.merged_at = merged_at;
    }

    public String getMerge_commit_sha() {
        return merge_commit_sha;
    }

    public void setMerge_commit_sha(String merge_commit_sha) {
        this.merge_commit_sha = merge_commit_sha;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public String getAuthor_association() {
        return author_association;
    }

    public void setAuthor_association(String author_association) {
        this.author_association = author_association;
    }

    public Boolean isDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public Boolean isMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public Boolean isMergeable() {
        return mergeable;
    }

    public void setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
    }

    public Boolean isRebaseable() {
        return rebaseable;
    }

    public void setRebaseable(Boolean rebaseable) {
        this.rebaseable = rebaseable;
    }

    public String getMergeable_state() {
        return mergeable_state;
    }

    public void setMergeable_state(String mergeable_state) {
        this.mergeable_state = mergeable_state;
    }

    public MergedBy getMerged_by() {
        return merged_by;
    }

    public void setMerged_by(MergedBy merged_by) {
        this.merged_by = merged_by;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getReview_comments() {
        return review_comments;
    }

    public void setReview_comments(Integer review_comments) {
        this.review_comments = review_comments;
    }

    public Boolean isMaintainer_can_modify() {
        return maintainer_can_modify;
    }

    public void setMaintainer_can_modify(Boolean maintainer_can_modify) {
        this.maintainer_can_modify = maintainer_can_modify;
    }

    public Integer getCommits() {
        return commits;
    }

    public void setCommits(Integer commits) {
        this.commits = commits;
    }

    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public Integer getChanged_files() {
        return changed_files;
    }

    public void setChanged_files(Integer changed_files) {
        this.changed_files = changed_files;
    }

    public List<Labels> getLabels() {
        return labels;
    }

    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    public List<Assignees> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<Assignees> assignees) {
        this.assignees = assignees;
    }

    public List<RequestedReviewers> getRequested_reviewers() {
        return requested_reviewers;
    }

    public void setRequested_reviewers(List<RequestedReviewers> requested_reviewers) {
        this.requested_reviewers = requested_reviewers;
    }

    public List<RequestedTeams> getRequested_teams() {
        return requested_teams;
    }

    public void setRequested_teams(List<RequestedTeams> requested_teams) {
        this.requested_teams = requested_teams;
    }

    public static class User {
        private String login;
        private Integer id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private Boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class Milestone {
        private String url;
        private String html_url;
        private String labels_url;
        private Integer id;
        private String node_id;
        private Integer number;
        private String state;
        private String title;
        private String description;
        private Creator creator;
        private Integer open_issues;
        private Integer closed_issues;
        private String created_at;
        private String updated_at;
        private String closed_at;
        private String due_on;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getLabels_url() {
            return labels_url;
        }

        public void setLabels_url(String labels_url) {
            this.labels_url = labels_url;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Creator getCreator() {
            return creator;
        }

        public void setCreator(Creator creator) {
            this.creator = creator;
        }

        public Integer getOpen_issues() {
            return open_issues;
        }

        public void setOpen_issues(Integer open_issues) {
            this.open_issues = open_issues;
        }

        public Integer getClosed_issues() {
            return closed_issues;
        }

        public void setClosed_issues(Integer closed_issues) {
            this.closed_issues = closed_issues;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getClosed_at() {
            return closed_at;
        }

        public void setClosed_at(String closed_at) {
            this.closed_at = closed_at;
        }

        public String getDue_on() {
            return due_on;
        }

        public void setDue_on(String due_on) {
            this.due_on = due_on;
        }

        public static class Creator {
            private String login;
            private Integer id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private Boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(Boolean site_admin) {
                this.site_admin = site_admin;
            }
        }
    }

    public static class Assignee {
        private String login;
        private Integer id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private Boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class Head {
        private String label;
        private String ref;
        private String sha;
        private User user;
        private Repo repo;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Repo getRepo() {
            return repo;
        }

        public void setRepo(Repo repo) {
            this.repo = repo;
        }

        public static class User {
            private String login;
            private Integer id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private Boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(Boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class Repo {
            private Integer id;
            private String node_id;
            private String name;
            private String full_name;
            private Owner owner;
            @JsonProperty("private")
            private Boolean privateX;
            private String html_url;
            private String description;
            private Boolean fork;
            private String url;
            private String archive_url;
            private String assignees_url;
            private String blobs_url;
            private String branches_url;
            private String collaborators_url;
            private String comments_url;
            private String commits_url;
            private String compare_url;
            private String contents_url;
            private String contributors_url;
            private String deployments_url;
            private String downloads_url;
            private String events_url;
            private String forks_url;
            private String git_commits_url;
            private String git_refs_url;
            private String git_tags_url;
            private String git_url;
            private String issue_comment_url;
            private String issue_events_url;
            private String issues_url;
            private String keys_url;
            private String labels_url;
            private String languages_url;
            private String merges_url;
            private String milestones_url;
            private String notifications_url;
            private String pulls_url;
            private String releases_url;
            private String ssh_url;
            private String stargazers_url;
            private String statuses_url;
            private String subscribers_url;
            private String subscription_url;
            private String tags_url;
            private String teams_url;
            private String trees_url;
            private String clone_url;
            private String mirror_url;
            private String hooks_url;
            private String svn_url;
            private String homepage;
            private Object language;
            private Integer forks_count;
            private Integer stargazers_count;
            private Integer watchers_count;
            private Integer size;
            private String default_branch;
            private Integer open_issues_count;
            private Boolean has_issues;
            private Boolean has_projects;
            private Boolean has_wiki;
            private Boolean has_pages;
            private Boolean has_downloads;
            private Boolean archived;
            private Boolean disabled;
            private String pushed_at;
            private String created_at;
            private String updated_at;
            private Permissions permissions;
            private Boolean allow_rebase_merge;
            private String temp_clone_token;
            private Boolean allow_squash_merge;
            private Boolean allow_merge_commit;
            private Integer forks;
            private Integer open_issues;
            private License license;
            private Integer watchers;
            private List<String> topics;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public Owner getOwner() {
                return owner;
            }

            public void setOwner(Owner owner) {
                this.owner = owner;
            }

            public Boolean isPrivateX() {
                return privateX;
            }

            public void setPrivateX(Boolean privateX) {
                this.privateX = privateX;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public Boolean isFork() {
                return fork;
            }

            public void setFork(Boolean fork) {
                this.fork = fork;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getArchive_url() {
                return archive_url;
            }

            public void setArchive_url(String archive_url) {
                this.archive_url = archive_url;
            }

            public String getAssignees_url() {
                return assignees_url;
            }

            public void setAssignees_url(String assignees_url) {
                this.assignees_url = assignees_url;
            }

            public String getBlobs_url() {
                return blobs_url;
            }

            public void setBlobs_url(String blobs_url) {
                this.blobs_url = blobs_url;
            }

            public String getBranches_url() {
                return branches_url;
            }

            public void setBranches_url(String branches_url) {
                this.branches_url = branches_url;
            }

            public String getCollaborators_url() {
                return collaborators_url;
            }

            public void setCollaborators_url(String collaborators_url) {
                this.collaborators_url = collaborators_url;
            }

            public String getComments_url() {
                return comments_url;
            }

            public void setComments_url(String comments_url) {
                this.comments_url = comments_url;
            }

            public String getCommits_url() {
                return commits_url;
            }

            public void setCommits_url(String commits_url) {
                this.commits_url = commits_url;
            }

            public String getCompare_url() {
                return compare_url;
            }

            public void setCompare_url(String compare_url) {
                this.compare_url = compare_url;
            }

            public String getContents_url() {
                return contents_url;
            }

            public void setContents_url(String contents_url) {
                this.contents_url = contents_url;
            }

            public String getContributors_url() {
                return contributors_url;
            }

            public void setContributors_url(String contributors_url) {
                this.contributors_url = contributors_url;
            }

            public String getDeployments_url() {
                return deployments_url;
            }

            public void setDeployments_url(String deployments_url) {
                this.deployments_url = deployments_url;
            }

            public String getDownloads_url() {
                return downloads_url;
            }

            public void setDownloads_url(String downloads_url) {
                this.downloads_url = downloads_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getForks_url() {
                return forks_url;
            }

            public void setForks_url(String forks_url) {
                this.forks_url = forks_url;
            }

            public String getGit_commits_url() {
                return git_commits_url;
            }

            public void setGit_commits_url(String git_commits_url) {
                this.git_commits_url = git_commits_url;
            }

            public String getGit_refs_url() {
                return git_refs_url;
            }

            public void setGit_refs_url(String git_refs_url) {
                this.git_refs_url = git_refs_url;
            }

            public String getGit_tags_url() {
                return git_tags_url;
            }

            public void setGit_tags_url(String git_tags_url) {
                this.git_tags_url = git_tags_url;
            }

            public String getGit_url() {
                return git_url;
            }

            public void setGit_url(String git_url) {
                this.git_url = git_url;
            }

            public String getIssue_comment_url() {
                return issue_comment_url;
            }

            public void setIssue_comment_url(String issue_comment_url) {
                this.issue_comment_url = issue_comment_url;
            }

            public String getIssue_events_url() {
                return issue_events_url;
            }

            public void setIssue_events_url(String issue_events_url) {
                this.issue_events_url = issue_events_url;
            }

            public String getIssues_url() {
                return issues_url;
            }

            public void setIssues_url(String issues_url) {
                this.issues_url = issues_url;
            }

            public String getKeys_url() {
                return keys_url;
            }

            public void setKeys_url(String keys_url) {
                this.keys_url = keys_url;
            }

            public String getLabels_url() {
                return labels_url;
            }

            public void setLabels_url(String labels_url) {
                this.labels_url = labels_url;
            }

            public String getLanguages_url() {
                return languages_url;
            }

            public void setLanguages_url(String languages_url) {
                this.languages_url = languages_url;
            }

            public String getMerges_url() {
                return merges_url;
            }

            public void setMerges_url(String merges_url) {
                this.merges_url = merges_url;
            }

            public String getMilestones_url() {
                return milestones_url;
            }

            public void setMilestones_url(String milestones_url) {
                this.milestones_url = milestones_url;
            }

            public String getNotifications_url() {
                return notifications_url;
            }

            public void setNotifications_url(String notifications_url) {
                this.notifications_url = notifications_url;
            }

            public String getPulls_url() {
                return pulls_url;
            }

            public void setPulls_url(String pulls_url) {
                this.pulls_url = pulls_url;
            }

            public String getReleases_url() {
                return releases_url;
            }

            public void setReleases_url(String releases_url) {
                this.releases_url = releases_url;
            }

            public String getSsh_url() {
                return ssh_url;
            }

            public void setSsh_url(String ssh_url) {
                this.ssh_url = ssh_url;
            }

            public String getStargazers_url() {
                return stargazers_url;
            }

            public void setStargazers_url(String stargazers_url) {
                this.stargazers_url = stargazers_url;
            }

            public String getStatuses_url() {
                return statuses_url;
            }

            public void setStatuses_url(String statuses_url) {
                this.statuses_url = statuses_url;
            }

            public String getSubscribers_url() {
                return subscribers_url;
            }

            public void setSubscribers_url(String subscribers_url) {
                this.subscribers_url = subscribers_url;
            }

            public String getSubscription_url() {
                return subscription_url;
            }

            public void setSubscription_url(String subscription_url) {
                this.subscription_url = subscription_url;
            }

            public String getTags_url() {
                return tags_url;
            }

            public void setTags_url(String tags_url) {
                this.tags_url = tags_url;
            }

            public String getTeams_url() {
                return teams_url;
            }

            public void setTeams_url(String teams_url) {
                this.teams_url = teams_url;
            }

            public String getTrees_url() {
                return trees_url;
            }

            public void setTrees_url(String trees_url) {
                this.trees_url = trees_url;
            }

            public String getClone_url() {
                return clone_url;
            }

            public void setClone_url(String clone_url) {
                this.clone_url = clone_url;
            }

            public String getMirror_url() {
                return mirror_url;
            }

            public void setMirror_url(String mirror_url) {
                this.mirror_url = mirror_url;
            }

            public String getHooks_url() {
                return hooks_url;
            }

            public void setHooks_url(String hooks_url) {
                this.hooks_url = hooks_url;
            }

            public String getSvn_url() {
                return svn_url;
            }

            public void setSvn_url(String svn_url) {
                this.svn_url = svn_url;
            }

            public String getHomepage() {
                return homepage;
            }

            public void setHomepage(String homepage) {
                this.homepage = homepage;
            }

            public Object getLanguage() {
                return language;
            }

            public void setLanguage(Object language) {
                this.language = language;
            }

            public Integer getForks_count() {
                return forks_count;
            }

            public void setForks_count(Integer forks_count) {
                this.forks_count = forks_count;
            }

            public Integer getStargazers_count() {
                return stargazers_count;
            }

            public void setStargazers_count(Integer stargazers_count) {
                this.stargazers_count = stargazers_count;
            }

            public Integer getWatchers_count() {
                return watchers_count;
            }

            public void setWatchers_count(Integer watchers_count) {
                this.watchers_count = watchers_count;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public String getDefault_branch() {
                return default_branch;
            }

            public void setDefault_branch(String default_branch) {
                this.default_branch = default_branch;
            }

            public Integer getOpen_issues_count() {
                return open_issues_count;
            }

            public void setOpen_issues_count(Integer open_issues_count) {
                this.open_issues_count = open_issues_count;
            }

            public Boolean isHas_issues() {
                return has_issues;
            }

            public void setHas_issues(Boolean has_issues) {
                this.has_issues = has_issues;
            }

            public Boolean isHas_projects() {
                return has_projects;
            }

            public void setHas_projects(Boolean has_projects) {
                this.has_projects = has_projects;
            }

            public Boolean isHas_wiki() {
                return has_wiki;
            }

            public void setHas_wiki(Boolean has_wiki) {
                this.has_wiki = has_wiki;
            }

            public Boolean isHas_pages() {
                return has_pages;
            }

            public void setHas_pages(Boolean has_pages) {
                this.has_pages = has_pages;
            }

            public Boolean isHas_downloads() {
                return has_downloads;
            }

            public void setHas_downloads(Boolean has_downloads) {
                this.has_downloads = has_downloads;
            }

            public Boolean isArchived() {
                return archived;
            }

            public void setArchived(Boolean archived) {
                this.archived = archived;
            }

            public Boolean isDisabled() {
                return disabled;
            }

            public void setDisabled(Boolean disabled) {
                this.disabled = disabled;
            }

            public String getPushed_at() {
                return pushed_at;
            }

            public void setPushed_at(String pushed_at) {
                this.pushed_at = pushed_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public Permissions getPermissions() {
                return permissions;
            }

            public void setPermissions(Permissions permissions) {
                this.permissions = permissions;
            }

            public Boolean isAllow_rebase_merge() {
                return allow_rebase_merge;
            }

            public void setAllow_rebase_merge(Boolean allow_rebase_merge) {
                this.allow_rebase_merge = allow_rebase_merge;
            }

            public String getTemp_clone_token() {
                return temp_clone_token;
            }

            public void setTemp_clone_token(String temp_clone_token) {
                this.temp_clone_token = temp_clone_token;
            }

            public Boolean isAllow_squash_merge() {
                return allow_squash_merge;
            }

            public void setAllow_squash_merge(Boolean allow_squash_merge) {
                this.allow_squash_merge = allow_squash_merge;
            }

            public Boolean isAllow_merge_commit() {
                return allow_merge_commit;
            }

            public void setAllow_merge_commit(Boolean allow_merge_commit) {
                this.allow_merge_commit = allow_merge_commit;
            }

            public Integer getForks() {
                return forks;
            }

            public void setForks(Integer forks) {
                this.forks = forks;
            }

            public Integer getOpen_issues() {
                return open_issues;
            }

            public void setOpen_issues(Integer open_issues) {
                this.open_issues = open_issues;
            }

            public License getLicense() {
                return license;
            }

            public void setLicense(License license) {
                this.license = license;
            }

            public Integer getWatchers() {
                return watchers;
            }

            public void setWatchers(Integer watchers) {
                this.watchers = watchers;
            }

            public List<String> getTopics() {
                return topics;
            }

            public void setTopics(List<String> topics) {
                this.topics = topics;
            }

            public static class Owner {
                private String login;
                private Integer id;
                private String node_id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private Boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public Boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(Boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }

            public static class Permissions {
                private Boolean admin;
                private Boolean push;
                private Boolean pull;

                public Boolean isAdmin() {
                    return admin;
                }

                public void setAdmin(Boolean admin) {
                    this.admin = admin;
                }

                public Boolean isPush() {
                    return push;
                }

                public void setPush(Boolean push) {
                    this.push = push;
                }

                public Boolean isPull() {
                    return pull;
                }

                public void setPull(Boolean pull) {
                    this.pull = pull;
                }
            }

            public static class License {
                private String key;
                private String name;
                private String url;
                private String spdx_id;
                private String node_id;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getSpdx_id() {
                    return spdx_id;
                }

                public void setSpdx_id(String spdx_id) {
                    this.spdx_id = spdx_id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }
            }
        }
    }

    public static class Base {
        private String label;
        private String ref;
        private String sha;
        private User user;
        private Repo repo;

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }

        public String getSha() {
            return sha;
        }

        public void setSha(String sha) {
            this.sha = sha;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Repo getRepo() {
            return repo;
        }

        public void setRepo(Repo repo) {
            this.repo = repo;
        }

        public static class User {
            private String login;
            private Integer id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private Boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public Boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(Boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class Repo {
            private Integer id;
            private String node_id;
            private String name;
            private String full_name;
            private Owner owner;
            @JsonProperty("private")
            private Boolean privateX;
            private String html_url;
            private String description;
            private Boolean fork;
            private String url;
            private String archive_url;
            private String assignees_url;
            private String blobs_url;
            private String branches_url;
            private String collaborators_url;
            private String comments_url;
            private String commits_url;
            private String compare_url;
            private String contents_url;
            private String contributors_url;
            private String deployments_url;
            private String downloads_url;
            private String events_url;
            private String forks_url;
            private String git_commits_url;
            private String git_refs_url;
            private String git_tags_url;
            private String git_url;
            private String issue_comment_url;
            private String issue_events_url;
            private String issues_url;
            private String keys_url;
            private String labels_url;
            private String languages_url;
            private String merges_url;
            private String milestones_url;
            private String notifications_url;
            private String pulls_url;
            private String releases_url;
            private String ssh_url;
            private String stargazers_url;
            private String statuses_url;
            private String subscribers_url;
            private String subscription_url;
            private String tags_url;
            private String teams_url;
            private String trees_url;
            private String clone_url;
            private String mirror_url;
            private String hooks_url;
            private String svn_url;
            private String homepage;
            private Object language;
            private Integer forks_count;
            private Integer stargazers_count;
            private Integer watchers_count;
            private Integer size;
            private String default_branch;
            private Integer open_issues_count;
            private Boolean has_issues;
            private Boolean has_projects;
            private Boolean has_wiki;
            private Boolean has_pages;
            private Boolean has_downloads;
            private Boolean archived;
            private Boolean disabled;
            private String pushed_at;
            private String created_at;
            private String updated_at;
            private Permissions permissions;
            private Boolean allow_rebase_merge;
            private String temp_clone_token;
            private Boolean allow_squash_merge;
            private Boolean allow_merge_commit;
            private Integer forks;
            private Integer open_issues;
            private License license;
            private Integer watchers;
            private List<String> topics;

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFull_name() {
                return full_name;
            }

            public void setFull_name(String full_name) {
                this.full_name = full_name;
            }

            public Owner getOwner() {
                return owner;
            }

            public void setOwner(Owner owner) {
                this.owner = owner;
            }

            public Boolean isPrivateX() {
                return privateX;
            }

            public void setPrivateX(Boolean privateX) {
                this.privateX = privateX;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public Boolean isFork() {
                return fork;
            }

            public void setFork(Boolean fork) {
                this.fork = fork;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getArchive_url() {
                return archive_url;
            }

            public void setArchive_url(String archive_url) {
                this.archive_url = archive_url;
            }

            public String getAssignees_url() {
                return assignees_url;
            }

            public void setAssignees_url(String assignees_url) {
                this.assignees_url = assignees_url;
            }

            public String getBlobs_url() {
                return blobs_url;
            }

            public void setBlobs_url(String blobs_url) {
                this.blobs_url = blobs_url;
            }

            public String getBranches_url() {
                return branches_url;
            }

            public void setBranches_url(String branches_url) {
                this.branches_url = branches_url;
            }

            public String getCollaborators_url() {
                return collaborators_url;
            }

            public void setCollaborators_url(String collaborators_url) {
                this.collaborators_url = collaborators_url;
            }

            public String getComments_url() {
                return comments_url;
            }

            public void setComments_url(String comments_url) {
                this.comments_url = comments_url;
            }

            public String getCommits_url() {
                return commits_url;
            }

            public void setCommits_url(String commits_url) {
                this.commits_url = commits_url;
            }

            public String getCompare_url() {
                return compare_url;
            }

            public void setCompare_url(String compare_url) {
                this.compare_url = compare_url;
            }

            public String getContents_url() {
                return contents_url;
            }

            public void setContents_url(String contents_url) {
                this.contents_url = contents_url;
            }

            public String getContributors_url() {
                return contributors_url;
            }

            public void setContributors_url(String contributors_url) {
                this.contributors_url = contributors_url;
            }

            public String getDeployments_url() {
                return deployments_url;
            }

            public void setDeployments_url(String deployments_url) {
                this.deployments_url = deployments_url;
            }

            public String getDownloads_url() {
                return downloads_url;
            }

            public void setDownloads_url(String downloads_url) {
                this.downloads_url = downloads_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getForks_url() {
                return forks_url;
            }

            public void setForks_url(String forks_url) {
                this.forks_url = forks_url;
            }

            public String getGit_commits_url() {
                return git_commits_url;
            }

            public void setGit_commits_url(String git_commits_url) {
                this.git_commits_url = git_commits_url;
            }

            public String getGit_refs_url() {
                return git_refs_url;
            }

            public void setGit_refs_url(String git_refs_url) {
                this.git_refs_url = git_refs_url;
            }

            public String getGit_tags_url() {
                return git_tags_url;
            }

            public void setGit_tags_url(String git_tags_url) {
                this.git_tags_url = git_tags_url;
            }

            public String getGit_url() {
                return git_url;
            }

            public void setGit_url(String git_url) {
                this.git_url = git_url;
            }

            public String getIssue_comment_url() {
                return issue_comment_url;
            }

            public void setIssue_comment_url(String issue_comment_url) {
                this.issue_comment_url = issue_comment_url;
            }

            public String getIssue_events_url() {
                return issue_events_url;
            }

            public void setIssue_events_url(String issue_events_url) {
                this.issue_events_url = issue_events_url;
            }

            public String getIssues_url() {
                return issues_url;
            }

            public void setIssues_url(String issues_url) {
                this.issues_url = issues_url;
            }

            public String getKeys_url() {
                return keys_url;
            }

            public void setKeys_url(String keys_url) {
                this.keys_url = keys_url;
            }

            public String getLabels_url() {
                return labels_url;
            }

            public void setLabels_url(String labels_url) {
                this.labels_url = labels_url;
            }

            public String getLanguages_url() {
                return languages_url;
            }

            public void setLanguages_url(String languages_url) {
                this.languages_url = languages_url;
            }

            public String getMerges_url() {
                return merges_url;
            }

            public void setMerges_url(String merges_url) {
                this.merges_url = merges_url;
            }

            public String getMilestones_url() {
                return milestones_url;
            }

            public void setMilestones_url(String milestones_url) {
                this.milestones_url = milestones_url;
            }

            public String getNotifications_url() {
                return notifications_url;
            }

            public void setNotifications_url(String notifications_url) {
                this.notifications_url = notifications_url;
            }

            public String getPulls_url() {
                return pulls_url;
            }

            public void setPulls_url(String pulls_url) {
                this.pulls_url = pulls_url;
            }

            public String getReleases_url() {
                return releases_url;
            }

            public void setReleases_url(String releases_url) {
                this.releases_url = releases_url;
            }

            public String getSsh_url() {
                return ssh_url;
            }

            public void setSsh_url(String ssh_url) {
                this.ssh_url = ssh_url;
            }

            public String getStargazers_url() {
                return stargazers_url;
            }

            public void setStargazers_url(String stargazers_url) {
                this.stargazers_url = stargazers_url;
            }

            public String getStatuses_url() {
                return statuses_url;
            }

            public void setStatuses_url(String statuses_url) {
                this.statuses_url = statuses_url;
            }

            public String getSubscribers_url() {
                return subscribers_url;
            }

            public void setSubscribers_url(String subscribers_url) {
                this.subscribers_url = subscribers_url;
            }

            public String getSubscription_url() {
                return subscription_url;
            }

            public void setSubscription_url(String subscription_url) {
                this.subscription_url = subscription_url;
            }

            public String getTags_url() {
                return tags_url;
            }

            public void setTags_url(String tags_url) {
                this.tags_url = tags_url;
            }

            public String getTeams_url() {
                return teams_url;
            }

            public void setTeams_url(String teams_url) {
                this.teams_url = teams_url;
            }

            public String getTrees_url() {
                return trees_url;
            }

            public void setTrees_url(String trees_url) {
                this.trees_url = trees_url;
            }

            public String getClone_url() {
                return clone_url;
            }

            public void setClone_url(String clone_url) {
                this.clone_url = clone_url;
            }

            public String getMirror_url() {
                return mirror_url;
            }

            public void setMirror_url(String mirror_url) {
                this.mirror_url = mirror_url;
            }

            public String getHooks_url() {
                return hooks_url;
            }

            public void setHooks_url(String hooks_url) {
                this.hooks_url = hooks_url;
            }

            public String getSvn_url() {
                return svn_url;
            }

            public void setSvn_url(String svn_url) {
                this.svn_url = svn_url;
            }

            public String getHomepage() {
                return homepage;
            }

            public void setHomepage(String homepage) {
                this.homepage = homepage;
            }

            public Object getLanguage() {
                return language;
            }

            public void setLanguage(Object language) {
                this.language = language;
            }

            public Integer getForks_count() {
                return forks_count;
            }

            public void setForks_count(Integer forks_count) {
                this.forks_count = forks_count;
            }

            public Integer getStargazers_count() {
                return stargazers_count;
            }

            public void setStargazers_count(Integer stargazers_count) {
                this.stargazers_count = stargazers_count;
            }

            public Integer getWatchers_count() {
                return watchers_count;
            }

            public void setWatchers_count(Integer watchers_count) {
                this.watchers_count = watchers_count;
            }

            public Integer getSize() {
                return size;
            }

            public void setSize(Integer size) {
                this.size = size;
            }

            public String getDefault_branch() {
                return default_branch;
            }

            public void setDefault_branch(String default_branch) {
                this.default_branch = default_branch;
            }

            public Integer getOpen_issues_count() {
                return open_issues_count;
            }

            public void setOpen_issues_count(Integer open_issues_count) {
                this.open_issues_count = open_issues_count;
            }

            public Boolean isHas_issues() {
                return has_issues;
            }

            public void setHas_issues(Boolean has_issues) {
                this.has_issues = has_issues;
            }

            public Boolean isHas_projects() {
                return has_projects;
            }

            public void setHas_projects(Boolean has_projects) {
                this.has_projects = has_projects;
            }

            public Boolean isHas_wiki() {
                return has_wiki;
            }

            public void setHas_wiki(Boolean has_wiki) {
                this.has_wiki = has_wiki;
            }

            public Boolean isHas_pages() {
                return has_pages;
            }

            public void setHas_pages(Boolean has_pages) {
                this.has_pages = has_pages;
            }

            public Boolean isHas_downloads() {
                return has_downloads;
            }

            public void setHas_downloads(Boolean has_downloads) {
                this.has_downloads = has_downloads;
            }

            public Boolean isArchived() {
                return archived;
            }

            public void setArchived(Boolean archived) {
                this.archived = archived;
            }

            public Boolean isDisabled() {
                return disabled;
            }

            public void setDisabled(Boolean disabled) {
                this.disabled = disabled;
            }

            public String getPushed_at() {
                return pushed_at;
            }

            public void setPushed_at(String pushed_at) {
                this.pushed_at = pushed_at;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public Permissions getPermissions() {
                return permissions;
            }

            public void setPermissions(Permissions permissions) {
                this.permissions = permissions;
            }

            public Boolean isAllow_rebase_merge() {
                return allow_rebase_merge;
            }

            public void setAllow_rebase_merge(Boolean allow_rebase_merge) {
                this.allow_rebase_merge = allow_rebase_merge;
            }

            public String getTemp_clone_token() {
                return temp_clone_token;
            }

            public void setTemp_clone_token(String temp_clone_token) {
                this.temp_clone_token = temp_clone_token;
            }

            public Boolean isAllow_squash_merge() {
                return allow_squash_merge;
            }

            public void setAllow_squash_merge(Boolean allow_squash_merge) {
                this.allow_squash_merge = allow_squash_merge;
            }

            public Boolean isAllow_merge_commit() {
                return allow_merge_commit;
            }

            public void setAllow_merge_commit(Boolean allow_merge_commit) {
                this.allow_merge_commit = allow_merge_commit;
            }

            public Integer getForks() {
                return forks;
            }

            public void setForks(Integer forks) {
                this.forks = forks;
            }

            public Integer getOpen_issues() {
                return open_issues;
            }

            public void setOpen_issues(Integer open_issues) {
                this.open_issues = open_issues;
            }

            public License getLicense() {
                return license;
            }

            public void setLicense(License license) {
                this.license = license;
            }

            public Integer getWatchers() {
                return watchers;
            }

            public void setWatchers(Integer watchers) {
                this.watchers = watchers;
            }

            public List<String> getTopics() {
                return topics;
            }

            public void setTopics(List<String> topics) {
                this.topics = topics;
            }

            public static class Owner {
                private String login;
                private Integer id;
                private String node_id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private Boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public Integer getId() {
                    return id;
                }

                public void setId(Integer id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public Boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(Boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }

            public static class Permissions {
                private Boolean admin;
                private Boolean push;
                private Boolean pull;

                public Boolean isAdmin() {
                    return admin;
                }

                public void setAdmin(Boolean admin) {
                    this.admin = admin;
                }

                public Boolean isPush() {
                    return push;
                }

                public void setPush(Boolean push) {
                    this.push = push;
                }

                public Boolean isPull() {
                    return pull;
                }

                public void setPull(Boolean pull) {
                    this.pull = pull;
                }
            }

            public static class License {
                private String key;
                private String name;
                private String url;
                private String spdx_id;
                private String node_id;

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getSpdx_id() {
                    return spdx_id;
                }

                public void setSpdx_id(String spdx_id) {
                    this.spdx_id = spdx_id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }
            }
        }
    }

    public static class Links {
        private Self self;
        private Html html;
        private Issue issue;
        private Comments comments;
        private ReviewComments review_comments;
        private ReviewComment review_comment;
        private Commits commits;
        private Statuses statuses;

        public Self getSelf() {
            return self;
        }

        public void setSelf(Self self) {
            this.self = self;
        }

        public Html getHtml() {
            return html;
        }

        public void setHtml(Html html) {
            this.html = html;
        }

        public Issue getIssue() {
            return issue;
        }

        public void setIssue(Issue issue) {
            this.issue = issue;
        }

        public Comments getComments() {
            return comments;
        }

        public void setComments(Comments comments) {
            this.comments = comments;
        }

        public ReviewComments getReview_comments() {
            return review_comments;
        }

        public void setReview_comments(ReviewComments review_comments) {
            this.review_comments = review_comments;
        }

        public ReviewComment getReview_comment() {
            return review_comment;
        }

        public void setReview_comment(ReviewComment review_comment) {
            this.review_comment = review_comment;
        }

        public Commits getCommits() {
            return commits;
        }

        public void setCommits(Commits commits) {
            this.commits = commits;
        }

        public Statuses getStatuses() {
            return statuses;
        }

        public void setStatuses(Statuses statuses) {
            this.statuses = statuses;
        }

        public static class Self {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class Html {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class Issue {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class Comments {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class ReviewComments {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class ReviewComment {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class Commits {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }

        public static class Statuses {
            private String href;

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }
        }
    }

    public static class MergedBy {
        private String login;
        private Integer id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private Boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class Labels {
        private Integer id;
        private String node_id;
        private String url;
        private String name;
        private String description;
        private String color;
        @JsonProperty("default")
        private Boolean defaultX;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Boolean isDefaultX() {
            return defaultX;
        }

        public void setDefaultX(Boolean defaultX) {
            this.defaultX = defaultX;
        }
    }

    public static class Assignees {
        private String login;
        private Integer id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private Boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class RequestedReviewers {
        private String login;
        private Integer id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private Boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(Boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class RequestedTeams {
        private Integer id;
        private String node_id;
        private String url;
        private String html_url;
        private String name;
        private String slug;
        private String description;
        private String privacy;
        private String permission;
        private String members_url;
        private String repositories_url;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrivacy() {
            return privacy;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public String getPermission() {
            return permission;
        }

        public void setPermission(String permission) {
            this.permission = permission;
        }

        public String getMembers_url() {
            return members_url;
        }

        public void setMembers_url(String members_url) {
            this.members_url = members_url;
        }

        public String getRepositories_url() {
            return repositories_url;
        }

        public void setRepositories_url(String repositories_url) {
            this.repositories_url = repositories_url;
        }
    }
}
