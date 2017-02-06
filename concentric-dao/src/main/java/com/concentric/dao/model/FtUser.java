package com.concentric.dao.model;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * The persistent class for the ft_user database table.
 * 
 */
public class FtUser  extends BaseModel{
	private static final long serialVersionUID = 1L;

	public String userId;

	private String userName;

	private String userPasswrod;

	private Date userSignTime;

	private String userStatus;

	private String userType;

	private Date userUpdateTime;

	public FtUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPasswrod() {
		return this.userPasswrod;
	}

	public void setUserPasswrod(String userPasswrod) {
		this.userPasswrod = userPasswrod;
	}

	public Date getUserSignTime() {
		return this.userSignTime;
	}

	public void setUserSignTime(Date userSignTime) {
		this.userSignTime = userSignTime;
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getUserUpdateTime() {
		return this.userUpdateTime;
	}

	public void setUserUpdateTime(Date userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}
	
}