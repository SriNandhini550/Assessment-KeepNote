package com.dxc.model;

public class UserCredentials {
	
	private String userId;

	private String userPassword;

	public UserCredentials() {
		super();
	}

	public UserCredentials(String userId, String userPassword) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "UserCredentials [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
	
	
}
