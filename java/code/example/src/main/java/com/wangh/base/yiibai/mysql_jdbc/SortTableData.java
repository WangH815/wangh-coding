package com.wangh.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SortTableData {
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
        Statement stmt = con.createStatement();
        String query = "select * from employees order by first";
        String query1 = "select * from employees order by last, age";

        ResultSet rs = stmt.executeQuery(query);
        System.out.println("Table contents sorted by Name");
        System.out.println("Id Name age");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("first");
            String age = rs.getString("age");
            System.out.println(id + "  " + name + "   " + age);
        }
        rs = stmt.executeQuery(query1);
        System.out.println("Table contents after sorted by last & age");
        System.out.println("Id lastname    age");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("last");
            String age = rs.getString("age");
            System.out.println(id + "  " + name + "   " + age);
        }
    }
}
