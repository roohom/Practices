package com.roohom.demo.ClassDemo.JDBC.PreparedStatement;

import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.*;

/**
 * ClassName: JdbcPrepareStatement
 * Author: Roohom
 * Function:预编译，防止sql注入
 * Date: 2020/8/6 15:10
 * Software: IntelliJ IDEA
 */

public class JdbcPrepareStatement {

    //插入
    public static void testInsert() {
        Connection conn = Jdbcutils.getConnection();
        String sql = "insert into users(name) values(?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "da");
            int row = pstmt.executeUpdate();
            if (row > 0) {
                System.out.println("插入成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, null, null);
        }
    }

    //修改
    public static void testUpdate() {
        Connection conn = Jdbcutils.getConnection();
        String sql = "update users set name = ? where id = ?";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "李大神");
            pstmt.setInt(2, 10);
            int row = pstmt.executeUpdate();
            if (row > 0) {
                System.out.println("修改成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, pstmt, null);
        }
    }

    //查询
    public static void testQuery() {
        Connection conn = Jdbcutils.getConnection();
        String sql = "select * from users";
        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");
                System.out.println("id=" + id + ", name=" + name + ", age=" + ", sex=" + sex);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, pstmt, null);
        }
    }

    public static void main(String[] args) {
        //testInsert();
        testUpdate();
        //testQuery();
    }
}
