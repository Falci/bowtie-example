package com.kenzan.bowtie.example.github.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {

	private String id;
	private Owner owner;
	private String name;

	@JsonProperty("full_name")
	private String fullName;
	private String description;

	@JsonProperty("private")
	private boolean isPrivate;
	private boolean fork;
	private String url;

	@JsonProperty("html_url")
	private String htmlUrl;

	@JsonProperty("archive_url")
	private String archiveUrl;

	@JsonProperty("assignees_url")
	private String assigneesUrl;

	@JsonProperty("blobs_url")
	private String blobsUrl;

	@JsonProperty("branches_url")
	private String branchesUrl;

	@JsonProperty("clone_url")
	private String cloneUrl;

	@JsonProperty("collaborators_url")
	private String collaboratorsUrl;

	@JsonProperty("comments_url")
	private String commentsUrl;

	@JsonProperty("commits_url")
	private String commitsUrl;

	@JsonProperty("compare_url")
	private String compareUrl;

	@JsonProperty("contents_url")
	private String contentsUrl;

	@JsonProperty("contributors_url")
	private String contributorsUrl;

	@JsonProperty("downloads_url")
	private String downloadsUrl;

	@JsonProperty("events_url")
	private String eventsUrl;

	@JsonProperty("forks_url")
	private String forksUrl;

	@JsonProperty("git_commits_url")
	private String gitCommitsUrl;

	@JsonProperty("git_refs_url")
	private String gitRefsUrl;

	@JsonProperty("git_tags_url")
	private String gitTagsUrl;

	@JsonProperty("git_url")
	private String gitUrl;

	@JsonProperty("hooks_url")
	private String hooksUrl;

	@JsonProperty("issue_comment_url")
	private String issueCommentUrl;

	@JsonProperty("issue_events_url")
	private String issueEventsUrl;

	@JsonProperty("issues_url")
	private String issuesUrl;

	@JsonProperty("keys_url")
	private String keysUrl;

	@JsonProperty("labels_url")
	private String labelsUrl;

	@JsonProperty("languages_url")
	private String languagesUrl;

	@JsonProperty("merges_url")
	private String mergesUrl;

	@JsonProperty("milestones_url")
	private String milestonesUrl;

	@JsonProperty("mirror_url")
	private String mirrorUrl;

	@JsonProperty("notifications_url")
	private String notificationsUrl;

	@JsonProperty("pulls_url")
	private String pullsUrl;

	@JsonProperty("releases_url")
	private String releasesUrl;

	@JsonProperty("ssh_url")
	private String sshUrl;

	@JsonProperty("stargazers_url")
	private String stargazersUrl;

	@JsonProperty("statuses_url")
	private String statusesUrl;

	@JsonProperty("subscribers_url")
	private String subscribersUrl;

	@JsonProperty("subscription_url")
	private String subscriptionUrl;

	@JsonProperty("svn_url")
	private String svnUrl;

	@JsonProperty("tags_url")
	private String tagsUrl;

	@JsonProperty("teams_url")
	private String teamsUrl;

	@JsonProperty("trees_url")
	private String treesUrl;
	private String homepage;
	private String language;

	@JsonProperty("forks_count")
	private Long forksCount;

	@JsonProperty("stargazers_count")
	private Long stargazersCount;

	@JsonProperty("watchers_count")
	private Long watchersCount;
	private Long size;

	@JsonProperty("default_branch")
	private String defaultBranch;

	@JsonProperty("open_issues_count")
	private Long openIssuesCount;

	@JsonProperty("has_issues")
	private boolean hasIssues;

	@JsonProperty("has_wiki")
	private boolean hasWiki;

	@JsonProperty("has_pages")
	private boolean hasPages;

	@JsonProperty("has_downloads")
	private boolean hasDownloads;

	@JsonProperty("pushed_at")
	private Date pushedAt;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("updated_at")
	private Date updatedAt;
	private Permission permissions;

	@JsonProperty("subscribers_count")
	private Long subscribersCount;
	private Organization organization;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPrivate() {
		return isPrivate;
	}
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
	public boolean isFork() {
		return fork;
	}
	public void setFork(boolean fork) {
		this.fork = fork;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHtmlUrl() {
		return htmlUrl;
	}
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
	public String getArchiveUrl() {
		return archiveUrl;
	}
	public void setArchiveUrl(String archiveUrl) {
		this.archiveUrl = archiveUrl;
	}
	public String getAssigneesUrl() {
		return assigneesUrl;
	}
	public void setAssigneesUrl(String assigneesUrl) {
		this.assigneesUrl = assigneesUrl;
	}
	public String getBlobsUrl() {
		return blobsUrl;
	}
	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}
	public String getBranchesUrl() {
		return branchesUrl;
	}
	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}
	public String getCloneUrl() {
		return cloneUrl;
	}
	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}
	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}
	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}
	public String getCommentsUrl() {
		return commentsUrl;
	}
	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}
	public String getCommitsUrl() {
		return commitsUrl;
	}
	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}
	public String getCompareUrl() {
		return compareUrl;
	}
	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}
	public String getContentsUrl() {
		return contentsUrl;
	}
	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}
	public String getContributorsUrl() {
		return contributorsUrl;
	}
	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}
	public String getDownloadsUrl() {
		return downloadsUrl;
	}
	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}
	public String getEventsUrl() {
		return eventsUrl;
	}
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}
	public String getForksUrl() {
		return forksUrl;
	}
	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}
	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}
	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}
	public String getGitRefsUrl() {
		return gitRefsUrl;
	}
	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}
	public String getGitTagsUrl() {
		return gitTagsUrl;
	}
	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}
	public String getGitUrl() {
		return gitUrl;
	}
	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}
	public String getHooksUrl() {
		return hooksUrl;
	}
	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}
	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}
	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}
	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}
	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}
	public String getIssuesUrl() {
		return issuesUrl;
	}
	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}
	public String getKeysUrl() {
		return keysUrl;
	}
	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}
	public String getLabelsUrl() {
		return labelsUrl;
	}
	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}
	public String getLanguagesUrl() {
		return languagesUrl;
	}
	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}
	public String getMergesUrl() {
		return mergesUrl;
	}
	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}
	public String getMilestonesUrl() {
		return milestonesUrl;
	}
	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}
	public String getMirrorUrl() {
		return mirrorUrl;
	}
	public void setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
	}
	public String getNotificationsUrl() {
		return notificationsUrl;
	}
	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}
	public String getPullsUrl() {
		return pullsUrl;
	}
	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}
	public String getReleasesUrl() {
		return releasesUrl;
	}
	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}
	public String getSshUrl() {
		return sshUrl;
	}
	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
	}
	public String getStargazersUrl() {
		return stargazersUrl;
	}
	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}
	public String getStatusesUrl() {
		return statusesUrl;
	}
	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}
	public String getSubscribersUrl() {
		return subscribersUrl;
	}
	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}
	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}
	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}
	public String getSvnUrl() {
		return svnUrl;
	}
	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}
	public String getTagsUrl() {
		return tagsUrl;
	}
	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}
	public String getTeamsUrl() {
		return teamsUrl;
	}
	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}
	public String getTreesUrl() {
		return treesUrl;
	}
	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Long getForksCount() {
		return forksCount;
	}
	public void setForksCount(Long forksCount) {
		this.forksCount = forksCount;
	}
	public Long getStargazersCount() {
		return stargazersCount;
	}
	public void setStargazersCount(Long stargazersCount) {
		this.stargazersCount = stargazersCount;
	}
	public Long getWatchersCount() {
		return watchersCount;
	}
	public void setWatchersCount(Long watchersCount) {
		this.watchersCount = watchersCount;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getDefaultBranch() {
		return defaultBranch;
	}
	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}
	public Long getOpenIssuesCount() {
		return openIssuesCount;
	}
	public void setOpenIssuesCount(Long openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}
	public boolean isHasIssues() {
		return hasIssues;
	}
	public void setHasIssues(boolean hasIssues) {
		this.hasIssues = hasIssues;
	}
	public boolean isHasWiki() {
		return hasWiki;
	}
	public void setHasWiki(boolean hasWiki) {
		this.hasWiki = hasWiki;
	}
	public boolean isHasPages() {
		return hasPages;
	}
	public void setHasPages(boolean hasPages) {
		this.hasPages = hasPages;
	}
	public boolean isHasDownloads() {
		return hasDownloads;
	}
	public void setHasDownloads(boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
	}
	public Date getPushedAt() {
		return pushedAt;
	}
	public void setPushedAt(Date pushedAt) {
		this.pushedAt = pushedAt;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Permission getPermissions() {
		return permissions;
	}
	public void setPermissions(Permission permissions) {
		this.permissions = permissions;
	}
	public Long getSubscribersCount() {
		return subscribersCount;
	}
	public void setSubscribersCount(Long subscribersCount) {
		this.subscribersCount = subscribersCount;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	  
}
