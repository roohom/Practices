package me.roohom.OperateOnDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ClassName: UserLogin
 * Author: Roohom
 * Function:C3P0连接输出库实现用户登录
 * Date: 2020/8/7 17:26
 * Software: IntelliJ IDEA
 */
public class UserLogin {
    public static void main(String[] args) {
        Connection conndb = C3p0Utils.getConnection();
        String sql = "select * from user where name=?";
        ResultSet rs = null;
        PreparedStatement pstmt = null;
        try {
            pstmt = conndb.prepareStatement(sql);
            System.out.println("请输入用户名:");
            String inputName = new Scanner(System.in).next();
            pstmt.setString(1, inputName);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String userName = rs.getString("name");
                if (inputName.equals(userName)) {
                    String pwd = rs.getString("passwd");
                    System.out.println("请输入密码:");
                    String userpwd = new Scanner(System.in).next();
                    if (userpwd.equals(pwd)) {
                        System.out.println("登录成功！");
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            C3p0Utils.releaseAll(rs, pstmt, conndb);
        }
    }
}
