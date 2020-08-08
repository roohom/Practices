package com.roohom.demo.homework.day18;

import com.roohom.demo.ClassDemo.JDBC.ConnectionPool.tools.C3p0Utils;
import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: QueryAllToList
 * Author: Roohom
 * Function:从数据库中查询所有用户的信息存储在List集合中
 * Date: 2020/8/7 18:00
 * Software: IntelliJ IDEA
 */
public class QueryAllToList {
    public static void main(String[] args) {
        Connection conn = C3p0Utils.getConnection();
        String sql = "SELECT * FROM USER";
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<UserEntity> list = new ArrayList();

        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String passwd = rs.getString("passwd");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");
                Date date = rs.getDate("adddate");
                UserEntity ue = new UserEntity(id, name, passwd, age, gender, date);
                list.add(ue);
            }
            System.out.println("list:" + list);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            C3p0Utils.releaseAll(rs, pst, conn);
        }
    }
}
