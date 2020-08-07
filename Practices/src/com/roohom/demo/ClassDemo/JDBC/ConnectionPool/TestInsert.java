package com.roohom.demo.ClassDemo.JDBC.ConnectionPool;

import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ClassName: TestInsert
 * Author: Roohom
 * Function:向表中插入一条数据
 * Date: 2020/8/6 20:25
 * Software: IntelliJ IDEA
 */
public class TestInsert {
    public static void main(String[] args) {
        Connection conn = Jdbcutils.getConnection();
        String sql = "insert into users values(null,?,?,?)";
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, "小糖");
            psmt.setDouble(2, 24);
            psmt.setString(3,null);

            int i = psmt.executeUpdate();
            if (i > 0)
                System.out.println("插入成功！");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, psmt,null);
        }


    }
}
