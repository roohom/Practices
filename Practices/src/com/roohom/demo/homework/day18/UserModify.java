package com.roohom.demo.homework.day18;

import com.roohom.demo.ClassDemo.JDBC.ConnectionPool.tools.C3p0Utils;
import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ClassName: UserModify
 * Author: Roohom
 * Function:用户登录之后修改用户的密码
 * Date: 2020/8/7 17:44
 * Software: IntelliJ IDEA
 */
public class UserModify {
    public static void main(String[] args) {
        Connection conn = C3p0Utils.getConnection();
        PreparedStatement pstmt = null;
        PreparedStatement modify_pst;
        ResultSet rs = null;

        String sql = "select * from user where name=?";
        String modify = "update `user` set `passwd`=? where name=? ";

        try {
            pstmt = conn.prepareStatement(sql);
            System.out.println("请输入您的账户:");
            String inputName = new Scanner(System.in).next();
            pstmt.setString(1, inputName);
            rs = pstmt.executeQuery();
            //账号是唯一的，根据账号在数据库里检索到的肯定只有一条数据
            if (rs.next()) {
                String userName = rs.getString("name");
                if (inputName.equals(userName)) {
                    String pwd = rs.getString("passwd");
                    System.out.println("请输入您的密码:");
                    String userpwd = new Scanner(System.in).next();
                    if (userpwd.equals(pwd)) {
                        System.out.println("登录成功！");
                        System.out.println("您正在修改密码,系统提示您谨慎操作！");
                        System.out.print("请输入你的新密码:");
                        String newpwd = new Scanner(System.in).next();
                        modify_pst = conn.prepareStatement(modify);
                        modify_pst.setString(1, newpwd);
                        modify_pst.setString(2, inputName);
                        if (modify_pst.executeUpdate() > 0)
                            System.out.println("修改密码成功！");
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            C3p0Utils.releaseAll(rs, pstmt, conn);
        }
    }
}
