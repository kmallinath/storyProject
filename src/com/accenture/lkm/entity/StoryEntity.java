package com.accenture.lkm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.jpa.internal.schemagen.JpaSchemaGenerator.Generation;
import org.hibernate.validator.constraints.NotBlank;
@Entity
@Table(name="stories")
public class StoryEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer storyId;
	private String storyName;
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
