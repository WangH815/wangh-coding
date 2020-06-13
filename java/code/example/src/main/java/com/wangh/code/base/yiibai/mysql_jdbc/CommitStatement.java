package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CommitStatement {
    public static void main(String[] args) throws Exception {
    	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String User = "root";
        String Passwd = "root";
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        Connection con = DriverManager.getConnection(DB_URL, User, Passwd);
        con.setAutoCommit(false);
        Statement stmt = con.createStatement();
        String createTable = "CREATE TABLE `employees` ( `id` int(11) NOT NULL, `age` int(11) NOT NULL,`name` varchar(64) DEFAULT NULL,`dept_id` int(10) DEFAULT NULL,  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;";
        String query = "insert into employees(id, name,age,dept_id) values(1,'Maxsu', 27, 1)";
        String query1 = "insert into employees(id, name,age,dept_id) values(5,'苏小牛', 24, 2)";
        String query2 = "select * from employees";
        // 创建表
        stmt.execute(createTable);
        con.commit();

        ResultSet rs = stmt.executeQuery(query2);
        int no_of_rows = 0;

        while (rs.next()) {
            no_of_rows++;
        }
        System.out.println("No. of rows before commit statement = " + no_of_rows);
        con.setAutoCommit(false);
        stmt.execute(query1);
        stmt.execute(query);
        con.commit();
        rs = stmt.executeQuery(query2);
        no_of_rows = 0;

        while (rs.next()) {
            no_of_rows++;
        }
        System.out.println("No. of rows after commit statement = " + no_of_rows);
    }
}

