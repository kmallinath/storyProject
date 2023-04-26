package com.accenture.lkm.business.bean;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;

public class StoryBean {


	private Integer storyId;
	@NotBlank(message = "Please Enter Story Name")
	private String storyName;
	@NotBlank(message = "Story cannot be null")
	private String story;
	private Integer userId;
	public Integer getStoryId() {
		return storyId;
	}
	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
