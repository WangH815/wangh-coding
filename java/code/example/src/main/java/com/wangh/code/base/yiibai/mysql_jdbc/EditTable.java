package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EditTable {

	public static void main(String[] args) throws Exception {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		String user = "root";
		String passwd = "root";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		String query = "create table employees2(id integer primary key,"
				+ "first_name char(50),last_name char(75))";
		stmt.execute(query); //执行SQL
	}

}
