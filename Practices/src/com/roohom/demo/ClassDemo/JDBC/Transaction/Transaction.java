package com.roohom.demo.ClassDemo.JDBC.Transaction;

import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ClassName: AffairOperate
 * Author: Roohom
 * Function:
 * Date: 2020/8/6 20:45
 * Software: IntelliJ IDEA
 */
public class Transaction {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        String sql1 = "update account set balance=balance-100 where name=Jack";
        String sql2 = "update account set balance=balance+100 where name=Rose";
        conn = Jdbcutils.getConnection();
        //开启事务
        try {
            conn.setAutoCommit(false);
            st = conn.createStatement();

            int row1 = st.executeUpdate(sql1);
            int row2 = st.executeUpdate(sql2);

            if (row1 > 0 && row2 > 2) {
                System.out.println("转账成功！");
                conn.commit();
            }
        } catch (SQLException throwables) {
            //throwables.printStackTrace();
            System.out.println("转账失败！");
        }

        //回滚事务
        try {
            conn.rollback();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            Jdbcutils.releaseAll(conn, st, null);
        }
    }
}
