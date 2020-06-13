package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.*;

public class RetrieveTableContents {
    public static void main(String[] args) {
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String User = "root";
        String Passwd = "root";
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }

        try {
            Connection con = DriverManager.getConnection(DB_URL, User, Passwd);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            System.out.println("id  name  age");
            System.out.println("===========================");

            while (rs.next()) {
                int id = rs.getInt("id");
                String first_name = rs.getString("first");
                String last_name = rs.getString("last");
                String age = rs.getString("age");
                System.out.println(id + "   " + first_name + " " + last_name + "    " + age);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
    }
}