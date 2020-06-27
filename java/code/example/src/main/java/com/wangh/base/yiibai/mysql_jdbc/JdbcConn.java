package com.wangh.base.yiibai.mysql_jdbc;

import java.sql.*;

//建立数据库连接 并执行SQL语句
public class JdbcConn {
	
	public static void main(String[] args) {
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
		String User = "root";
		String Passwd = "root";
		try {
			//注册驱动
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		int total_rows = 0;
		String sql = "select * from employees";
		
		try {
			//获取连接
			Connection con = DriverManager.getConnection(DB_URL, User, Passwd);
			Statement stmt = con.createStatement();
			//执行SQL并返回结果
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				total_rows++;
			}
			System.out.println("There are " + total_rows + "records in the table.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
