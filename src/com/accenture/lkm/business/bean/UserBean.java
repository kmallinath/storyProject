package com.accenture.lkm.business.bean;

import javax.validation.constraints.NotNull;

public class UserBean {
	
	public UserBean() {
		super();
	}
	private Integer userId;
	@NotNull(message = "Username cannot be null")
	private String userName;
	@NotNull(message = "Password cannot be null")
	private String pwd;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return pwd;
	}
	public void setPassword(String password) {
		this.pwd = password;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", password=" + pwd + "]";
	}
	public UserBean(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.pwd = password;
	}
	
}
