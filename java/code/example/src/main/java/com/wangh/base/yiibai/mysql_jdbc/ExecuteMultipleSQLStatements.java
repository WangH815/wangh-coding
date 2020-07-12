package com.wangh.base.yiibai.mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecuteMultipleSQLStatements {
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

        String insertEmp1 = "insert into employees(id,name,age,dept_id) values(110,'Jay',19, 1)";
        String insertEmp2 = "insert into employees(id,name,age,dept_id) values(111,'Weiwei',22,2)";
        String insertEmp3 = "insert into employees(id,name,age,dept_id) values(112,'Hkou',25,3)";
        con.setAutoCommit(false);

        stmt.addBatch(insertEmp1);
        stmt.addBatch(insertEmp2);
        stmt.addBatch(insertEmp3);

        ResultSet rs = stmt.executeQuery("select * from employees");
        rs.last();
        System.out.println("rows before batch execution= " + rs.getRow());
        stmt.executeBatch();
        con.commit();

        System.out.println("Batch executed");
        rs = stmt.executeQuery("select * from employees");
        rs.last();
        System.out.println("rows after batch execution = " + rs.getRow());
    }
}
