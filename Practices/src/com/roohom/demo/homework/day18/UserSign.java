package com.roohom.demo.homework.day18;


import com.roohom.demo.ClassDemo.JDBC.ConnectionPool.tools.C3p0Utils;
import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * ClassName: UserSign
 * Author: Roohom
 * Function:使用连接池实现用户注册
 * Date: 2020/8/7 16:42
 * Software: IntelliJ IDEA
 */
public class UserSign {
    public static void main(String[] args) {
        Connection conndb = Jdbcutils.getConnection();
        String sql = "INSERT INTO user values(null,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conndb.prepareStatement(sql);
            System.out.print("请输入你的账号:");
            pstmt.setString(1,new Scanner(System.in).next());
            System.out.print("请输入您的密码:");
            pstmt.setString(2,new Scanner(System.in).next());
            System.out.print("请输入你的年龄:");
            pstmt.setInt(3,new Scanner(System.in).nextInt());
            System.out.print("请输入你的性别: 男 或者 女 ");
            pstmt.setString(4, new Scanner(System.in).next());
            Calendar calendar = Calendar.getInstance();
            String date = calendar.get(Calendar.YEAR)+"年"+(calendar.get(Calendar.MONTH)+1)+"月"+calendar.get(Calendar.DATE)+"日";
            System.out.println("您的注册日期是:"+date);
            pstmt.setString(5,date);

            int row = pstmt.executeUpdate();
            if (row>0)
            {
                System.out.println("注册成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            C3p0Utils.releaseAll(null,pstmt,conndb);
        }
    }
}
