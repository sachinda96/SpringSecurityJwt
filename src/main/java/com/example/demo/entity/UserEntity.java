package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

	@Id
	private String useid;
	private String userName;
	private String password;
	
	
	public String getUseid() {
		return useid;
	}
	public void setUseid(String useid) {
		this.useid = useid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
