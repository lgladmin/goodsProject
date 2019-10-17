package com.accp.pojo;

public class UserInfo {
	private String username;
	private String userpwd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(String username,String userpwd) {
		this.username=username;
		this.userpwd=userpwd;
	}
}
