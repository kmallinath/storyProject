package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.accenture.lkm.business.bean.StoryBean;
import com.accenture.lkm.business.bean.UserBean;

public interface UserService {	
	void registerUserDetails(UserBean userBean);
	List<UserBean>getAllUserDetails();
	void registerStoryDetails(StoryBean storyBean);
//	List<StoryBean> getCompliantDetailsByDate(Date fromDate,Date toDate);
//	Map<Integer,String> getAllCompliantTypes();
	UserBean getUserById(Integer id);
	List getAllStories();
}