package com.accenture.lkm.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.StoryBean;
import com.accenture.lkm.business.bean.UserBean;
import com.accenture.lkm.dao.userDAOWrapper;
import com.accenture.lkm.entity.UserEntity;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private userDAOWrapper udw;

	
	@Override
	public void registerUserDetails(UserBean userBean) {
		   udw.registerUserDetails(userBean);
		}

	@Override
	public List<UserBean> getAllUserDetails() {
		return udw.getAllUserDetails();
	}

	@Override
	public void registerStoryDetails(StoryBean storyBean) {
	
		 udw.registerStoryDetails(storyBean);
	}
	@Override
	public UserBean getUserById(Integer id) {
		return udw.getUserById(id);
	}

	@Override
	public List<StoryBean> getAllStories() {
		// TODO Auto-generated method stub
		return udw.getAllStories();
	}
	
	
	
       
	}
	

