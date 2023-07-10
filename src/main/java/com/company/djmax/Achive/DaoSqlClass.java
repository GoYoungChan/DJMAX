package com.company.djmax.Achive;

public class DaoSqlClass {
	
	// Song Data -> DB Insert
	// 해당 난이도 값을 입력했을 시 -> 컬럼명 추가 처리.
	public String insertName(String name) {
		return "insert into Song values()";
	}
	
	
	// Table Create Success.
	public String createRecord(String name) {
		return  "create table "+name+" ("
				+ "User_name varchar2(30),"
				+ "nm4 number(10,2),"
				+ "hd4 number(10,2),"
				+ "mx4 number(10,2),"
				+ "sc4 number(10,2),"
				+ "nm5 number(10,2),"
				+ "hd5 number(10,2),"
				+ "mx5 number(10,2),"
				+ "sc5 number(10,2),"
				+ "nm6 number(10,2),"
				+ "hd6 number(10,2),"
				+ "mx6 number(10,2),"
				+ "sc6 number(10,2),"
				+ "nm8 number(10,2),"
				+ "hd8 number(10,2),"
				+ "mx8 number(10,2),"
				+ "sc8 number(10,2),"
				+ "constraint Record"+name+"__PK primary key(User_name)"
				+ ")";
	}
}
