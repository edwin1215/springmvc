package com.edwin.domain.user;

import java.io.Serializable;

public class User implements Serializable {

	public static final long serialVersionUID = 1439104867583L;
	
	private String userNo;
	
	private String username;
	
	private String password;
	
	private String description;
	
	private String brance;

	public User() {
		
	}
	
	public User(String userNo) {
		this.userNo = userNo;
	}
	
	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrance() {
		return brance;
	}

	public void setBrance(String brance) {
		this.brance = brance;
	}
}
