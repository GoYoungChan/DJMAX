package com.company.djmax.Achive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AchiveDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insert() {
		
	}
}