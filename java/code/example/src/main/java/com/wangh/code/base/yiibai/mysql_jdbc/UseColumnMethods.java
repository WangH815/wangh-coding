package com.wangh.code.base.yiibai.mysql_jdbc;

import java.sql.*;

public class UseColumnMethods {
    public static void main(String[] args) throws Exception {

    	String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/testdb?useSSL=false";
        String User = "root";
        String Passwd = "root";
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }
        try {

            con = DriverManager.getConnection(DB_URL, User, Passwd);
            stmt = con.createStatement();
            String query = "select * from employees order by name";

            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("no of columns in the table = " + rsmd.getColumnCount());
            System.out.println("Name of the first column " + rsmd.getColumnName(1));
            System.out.println("Type of the second column " + rsmd.getColumnTypeName(2));
            System.out.println("No of characters in 3rd column " + rsmd.getColumnDisplaySize(2));
        } catch (

        SQLException e) {
            System.out.println("SQL exception occured" + e);
        }

    }
}
