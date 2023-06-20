package com.dxc.model;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Table(name="USERS")
public class User {

	@Id
	private String userId;
	private String userName;
	private String userPassword;
	private String userMobile;
	private String userAddedDate;
	public User() {
		super();
	}
	public User(String userId, String userName, String userPassword, String userMobile, String userAddedDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userMobile = userMobile;
		this.userAddedDate = userAddedDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserAddedDate() {
		return userAddedDate;
	}
	public void setUserAddedDate(String userAddedDate) {
		this.userAddedDate = userAddedDate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userMobile="
				+ userMobile + ", userAddedDate=" + userAddedDate + "]";
	}
	
	
}
