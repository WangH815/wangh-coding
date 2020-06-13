package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchTableContents {
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
        String query[] = { "SELECT * FROM employees where id = 101", 
                "select * from employees where first like 'Ma_'",
                "select * from employees where last like 'Brya%'" };

        for (String q : query) {
            ResultSet rs = stmt.executeQuery(q);
            System.out.print("Names for query " + q + " , Results : ");

            while (rs.next()) {
                String name = rs.getString("first");
                System.out.print(name + "  ");
            }
            System.out.println();
        }
    }
}