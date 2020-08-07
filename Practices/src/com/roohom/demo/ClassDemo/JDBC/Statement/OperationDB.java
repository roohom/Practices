package com.roohom.demo.ClassDemo.JDBC.Statement;

import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName: OperationDB
 * Author: Roohom
 * Function:数据库操作
 * Date: 2020/8/6 14:34
 * Software: IntelliJ IDEA
 */
public class OperationDB {

    //插入操作
    public static void jdbcUpdate() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        //获得连接
        conn = Jdbcutils.getConnection();
        //获得语句执行者
        try {
            st = conn.createStatement();

            int r = st.executeUpdate("insert into users(name ) value ('测试')");
            System.out.println(r);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, st, rs);
        }
    }

    //修改操作
    public static void jdbcModify() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        //获得连接
        conn = Jdbcutils.getConnection();
        //获得语句执行者
        try {
            st = conn.createStatement();

            int r = st.executeUpdate("update users set name='xiao' where id=8");
            System.out.println(r);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, st, rs);
        }
    }

    //查询操作
    public static void jdbcQuery() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        //获得连接
        conn = Jdbcutils.getConnection();
        //获得语句执行者
        try {
            st = conn.createStatement();

            rs = st.executeQuery("select * from users");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id=" + id + ", name=" + name);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, st, rs);
        }
    }


    public static void main(String[] args) {
        //jdbcUpdate();
        //jdbcModify();
        jdbcQuery();
    }
}
