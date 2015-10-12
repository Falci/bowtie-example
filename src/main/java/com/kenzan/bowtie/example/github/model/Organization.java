package com.kenzan.bowtie.example.github.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organization {
	
	private String login;
	private Long id;
	private String url;

	@JsonProperty("avatar_url")
	private String avatarUrl;
	private String description;
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;

	@JsonProperty("public_repos")
	private Integer publicRepos;
	
	@JsonProperty("public_gists")
	private Integer publicGists;
	private Integer followers;
	private Integer following;
	
	@JsonProperty("html_url")
	private String htmlUrl;

	@JsonProperty("created_at")
	private Date createdAt;
	private String type;
	
	public String getLogin() {
		return login;
	}
  
	public void setLogin(String login) {
		this.login = login;
	}
  
	public Long getId() {
		return id;
	}
  
	public void setId(Long id) {
		this.id = id;
	}
  
	public String getUrl() {
		return url;
	}
  
	public void setUrl(String url) {
		this.url = url;
	}
  
	public String getAvatarUrl() {
		return avatarUrl;
	}
  
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
  
	public String getDescription() {
		return description;
	}
  
	public void setDescription(String description) {
		this.description = description;
	}
  
	public String getName() {
		return name;
	}
  
	public void setName(String name) {
		this.name = name;
	}
  
	public String getCompany() {
		return company;
	}
  
	public void setCompany(String company) {
		this.company = company;
	}
  
	public String getBlog() {
		return blog;
	}
  
	public void setBlog(String blog) {
		this.blog = blog;
	}
  
	public String getLocation() {
		return location;
	}
  
	public void setLocation(String location) {
		this.location = location;
	}
  
	public String getEmail() {
		return email;
	}
  
	public void setEmail(String email) {
		this.email = email;
	}
  
	public Integer getPublicRepos() {
		return publicRepos;
	}
  
	public void setPublicRepos(Integer publicRepos) {
		this.publicRepos = publicRepos;
	}
  
	public Integer getPublicGists() {
		return publicGists;
	}
  
	public void setPublicGists(Integer publicGists) {
		this.publicGists = publicGists;
	}
  
	public Integer getFollowers() {
		return followers;
	}
  
	public void setFollowers(Integer followers) {
		this.followers = followers;
	}
  
	public Integer getFollowing() {
		return following;
	}
  
	public void setFollowing(Integer following) {
		this.following = following;
	}
  
	public String getHtmlUrl() {
		return htmlUrl;
	}
  
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}
  
	public Date getCreatedAt() {
		return createdAt;
	}
  
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
  
	public String getType() {
		return type;
	}
  
	public void setType(String type) {
		this.type = type;
	}
  
	@Override
	public String toString() {
		
		return type + ": " + login;
	}
	  
}
