package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveContentsFromMoreTable {
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
        String query = "SELECT e.name, e.age, d.name AS dname From employees e INNER JOIN dept d On e.dept_id = d.id";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("姓名    年龄    所在部门");
        System.out.println("====================================");
        while (rs.next()) {
            String name = rs.getString("name");
            String dname = rs.getString("dname");
            int age = rs.getInt("age");
            System.out.println(name + "  " + age + "   " + dname);
        }
        System.out.println();
    }
}
