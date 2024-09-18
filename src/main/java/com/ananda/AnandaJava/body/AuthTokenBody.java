package com.ananda.AnandaJava.body;

public class AuthTokenBody {
	 public String email;
	 public int userId;
	 public int userRoleId;
//	 public String name;;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	
	@Override
	public String toString() {
		return "AuthTokenBody [email=" + email + ", userId=" + userId + ", userRoleId=" + userRoleId + "]";
	}
	
	public AuthTokenBody(String email, int userId, int userRoleId) {
		super();
		this.email = email;
		this.userId = userId;
		this.userRoleId = userRoleId;
	}
	
	public AuthTokenBody() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
}
