package com.roohom.demo.ClassDemo.JDBC.ConnectionPool;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.roohom.demo.ClassDemo.JDBC.tools.Jdbcutils;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * ClassName: ConnectC3P0
 * Author: Roohom
 * Function:连接C30P0
 * Date: 2020/8/6 20:13
 * Software: IntelliJ IDEA
 */
public class ConnectC3P0 {
    public static void main(String[] args) {
        ComboPooledDataSource cpds = new ComboPooledDataSource();
        try {
            cpds.setDriverClass("com.mysql.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/roohom");
            cpds.setUser("root");
            cpds.setPassword("");
            cpds.setInitialPoolSize(5);
            cpds.setMaxPoolSize(10);
            cpds.setCheckoutTimeout(2000);
            for (int i = 0; i < 10; i++) {
                Connection conn = cpds.getConnection();
                System.out.println("第"+i+"个连接对象:"+conn);
                if (i==5)
                    conn.close();
            }
        } catch (PropertyVetoException | SQLException e) {
            e.printStackTrace();
        }
    }
}
