package com.company.djmax.Achive;

public class UserDTO {
	
	// 로그인에 필요한 정보 선언.
	
	private String id;			// ID
	private String password;	// Password
	private String name;		// Name
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}