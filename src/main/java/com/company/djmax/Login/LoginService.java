package com.company.djmax.Login;

public interface LoginService {

	// Register Service
	public void Register();
	
	// Login Check
	// Login Success - > 1 , Failed - > 0 Return
	public int idCheck();
}
