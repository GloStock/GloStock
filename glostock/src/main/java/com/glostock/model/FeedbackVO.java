package com.glostock.model;

public class FeedbackVO {

	private int feednum;
	private String title; 
	private String email;
	private String nickname; 
	private String content;
	
	public FeedbackVO() {
	
	}

	public FeedbackVO(String title, String email, String nickname, String content) {
		super();
		this.feednum= feednum;
		this.title = title;
		this.email = email;
		this.nickname = nickname;
		this.content = content;
	}

	
	
	public int getFeednum() {
		return feednum;
	}

	public void setFeednum(int feednum) {
		this.feednum = feednum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
