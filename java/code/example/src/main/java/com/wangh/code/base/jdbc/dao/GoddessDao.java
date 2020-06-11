package com.wangh.code.base.jdbc.dao;

import com.wangh.code.base.jdbc.DbUtil;
import com.wangh.code.base.jdbc.model.Goddess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GoddessDao {

    public void addGoddess(Goddess goddess) throws SQLException {
        // 获取数据库连接
        Connection connection = DbUtil.getConnection();
        // SQL语句拼接
        String sql = "INSERT INTO goddess(user_name, sex, age, birthday, email, mobile,"
                + "create_user, create_date, update_user, update_date, isdel)"
                + "values(" + "?,?,?,?,?,?,?,CURRENT_DATE(),?,CURRENT_DATE(),?)";

        PreparedStatement ptmt = connection.prepareStatement(sql);  //预编译SQL，降低执行时间

        ptmt.setString(1, goddess.getUser_name());
        ptmt.setInt(2, goddess.getSex());
        ptmt.setInt(3, goddess.getAge());
        ptmt.setDate(4, new Date(goddess.getBirthday().getTime()));
        ptmt.setString(5, goddess.getEmail());
        ptmt.setString(6, goddess.getMobile());
        ptmt.setString(7, goddess.getCreate_user());
        ptmt.setString(8, goddess.getUpdate_user());
        ptmt.setInt(9, goddess.getIsDel());

        ptmt.execute();
    }

    public void updateGoddessById() throws SQLException {   //单条数据更新
        Connection conn = DbUtil.getConnection();
        String sql = "UPDATE imooc_goddess" +
                " set user_name=?, sex=?, age=?, birthday=?, email=?, mobile=?," +
                " update_user=?, update_date=CURRENT_DATE(), isdel=? " + " where id=?";
        PreparedStatement ptmt = conn.prepareStatement(sql);

        Goddess goddess = new Goddess();
        ptmt.setString(1, goddess.getUser_name());
        ptmt.setInt(2, goddess.getSex());
        ptmt.setInt(3, goddess.getAge());
        ptmt.setDate(4, new Date(goddess.getBirthday().getTime()));
        ptmt.setString(5, goddess.getEmail());
        ptmt.setString(6, goddess.getMobile());
        ptmt.setString(7, goddess.getUpdate_user());
        ptmt.setInt(8, goddess.getIsDel());
        ptmt.setInt(9, goddess.getId());
        ptmt.execute();
    }

    public void delGoddessById(String id) throws SQLException {
        Connection conn = DbUtil.getConnection();
        String sql = "delete from imooc_goddess where id=?";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, Integer.valueOf(id));
        ptmt.execute();
    }

    public List<Goddess> queryAll() throws SQLException {
        Connection conn = DbUtil.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT user_name, age FROM goddess");

        List<Goddess> gs = new ArrayList<Goddess>();
        Goddess goddess = null;
        while (rs.next()) {
            goddess = new Goddess();
            goddess.setUser_name(rs.getString("user_name"));
            goddess.setAge(rs.getInt("age"));
            gs.add(goddess);
        }
        return gs;
    }

    public Goddess queryById(String id) throws SQLException {
        Goddess goddess = null;
        Connection conn = DbUtil.getConnection();
        String sql = "select * from goddess where id = ?";
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1, Integer.valueOf(id));
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()) {
            goddess = new Goddess();
            goddess.setId(rs.getInt("id"));
            goddess.setUser_name(rs.getString("user_name"));
            goddess.setAge(rs.getInt("age"));
            goddess.setSex(rs.getInt("sex"));
            goddess.setBirthday(rs.getDate("birthday"));
            goddess.setEmail(rs.getString("email"));
            goddess.setMobile(rs.getString("mobile"));
            goddess.setCreate_date(rs.getDate("create_date"));
            goddess.setCreate_user(rs.getString("create_user"));
            goddess.setUpdate_date(rs.getDate("update_date"));
            goddess.setUpdate_user(rs.getString("update_user"));
            goddess.setIsDel(rs.getInt("isdel"));
        }
        return goddess;
    }
}