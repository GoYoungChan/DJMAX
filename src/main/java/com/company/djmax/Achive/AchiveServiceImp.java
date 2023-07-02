package com.company.djmax.Achive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AchiveServiceImp implements AchiveService {
	
	@Autowired
	AchiveDAO dao;

	@Override
	public void insert() {
		dao.insert();
	}

}