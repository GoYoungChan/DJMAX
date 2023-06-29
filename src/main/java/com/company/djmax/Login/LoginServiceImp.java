package com.company.djmax.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {
	
	@Autowired
	LoginDAO dao;
	
	@Override
	public void Register() {
		System.out.println("Service 단 접속 성공.");
	}

	@Override
	public int idCheck() {
		return 0;
	}
}