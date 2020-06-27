package com.wangh.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UseRowMethods {
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
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        String query = "select * from employees";
        ResultSet rs = stmt.executeQuery(query);
        rs.last();
        System.out.println("No of rows in table = " + rs.getRow());

        rs.moveToInsertRow();
        rs.updateInt("id", 114);
        rs.updateString("name", "Suzend");
        rs.updateString("age", "26");
        rs.insertRow();

        System.out.println("Row added");
        rs.first();
        rs.deleteRow();
        System.out.println("first row deleted");
    }
}
