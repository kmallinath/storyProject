package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.StoryBean;
import com.accenture.lkm.business.bean.UserBean;
import com.accenture.lkm.entity.StoryEntity;
import com.accenture.lkm.entity.UserEntity;

@Repository
@Transactional(value = "txManager")
public class userDAOWrapper {
	
	@Autowired
	private StoryDAO storyDAO;

	@Autowired
	private UserDAO userDAO;
	
	@PersistenceContext
	private EntityManager manager;
	
	public UserBean registerUserDetails(UserBean userBean) {
		UserEntity ue =new UserEntity();
		BeanUtils.copyProperties(userBean, ue);
		userDAO.save(ue);
		return userBean;
	}
	public StoryBean registerStoryDetails(StoryBean storyBean) {
		StoryEntity se =new StoryEntity();
		BeanUtils.copyProperties(storyBean, se);
		storyDAO.save(se);
		//System.out.println(se.getUserId());
		return storyBean;
	}
	public List<UserBean> getAllUserDetails()
	{
		List<UserBean>al=new ArrayList<UserBean>();
		List<UserEntity>userEntityList=userDAO.findAll();
		for(UserEntity ue:userEntityList)
		{
			UserBean ub=new UserBean();
			BeanUtils.copyProperties(ue,ub);
			al.add(ub);
		}
		return al;
	}
	
	public UserBean getUserById(Integer id) {
		UserBean ub=new UserBean();
		UserEntity ue=manager.find(UserEntity.class,id);
		BeanUtils.copyProperties(ue, ub);
		return ub;
	}
	@SuppressWarnings("unchecked")
	public List<StoryBean> getAllStories() {
		// TODO Auto-generated method stub
		List<StoryBean>ans=new ArrayList<>();
		List<StoryEntity>lst=new ArrayList<>();
		lst=storyDAO.findAll();
		for(StoryEntity se:lst)
		{
			StoryBean sb=new StoryBean();
			BeanUtils.copyProperties(se, sb);
			ans.add(sb);
		}
		return ans;
	}
	
}
