package com.wangh.base.yiibai.mysql_jdbc;

import java.sql.*;

public class UseOfSavepointRollback {
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
        String query1 = "INSERT INTO employees(id,age,name,dept_id) VALUES (109, 25, 'TestSavePoint', 2);";
        String query2 = "select * from employees";

        con.setAutoCommit(false);
        Savepoint spt1 = con.setSavepoint("myspt1");
        stmt.execute(query1);
        ResultSet rs = stmt.executeQuery(query2);
        int no_of_rows = 0;

        while (rs.next()) {
            no_of_rows++;
        }
        System.out.println("rows before rollback statement = " + no_of_rows);
        con.rollback(spt1);
        con.commit();
        no_of_rows = 0;
        rs = stmt.executeQuery(query2);

        while (rs.next()) {
            no_of_rows++;
        }
        System.out.println("rows after rollback statement = " + no_of_rows);
    }
}
