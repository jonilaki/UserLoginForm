package com.userregistration;

public class User {
	private String username;
	private String password;
	public User(String username, String password) {
		
		this.username = username;
		this.password = password;
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
	public void login(String uname,String pwd) {
		if(this.username.equals(uname)&& this.password.equals(pwd)) {
			System.out.println("Your credentials match!");
		}
	}

}
