package com.foodplaza.pojo;

public class Admin {
	private String EmailId;
	private  String Password;
	
	
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Admin [EmailId=" + EmailId + ", Password=" + Password + "]";
	}
	
}
