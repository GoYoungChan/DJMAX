package com.company.djmax.Achive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AchiveDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	DaoSqlClass sql = new DaoSqlClass();
	
// When Song name Data have, User Data Insert.
	public void insert() {
		String song = "nightmare";
		jdbcTemplate.update("insert into "+song+" values(?,?,?)",song,99.86,99.67);
		System.out.println("데이터 저장 성공.");
	}
	
// Song Table Auto Created
	public void createTable(String name) {
		
		jdbcTemplate.update(sql.createRecord(name));
		jdbcTemplate.update("commit");
	}
}