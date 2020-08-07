package com.roohom.demo.ClassDemo.JDBC.tools;

import java.sql.*;

/**
 * ClassName: JDBCutils
 * Author: Roohom
 * Function:JBDC工具类
 * Date: 2020/8/6 14:26
 * Software: IntelliJ IDEA
 */
public class Jdbcutils {
    private static final String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/roohom";
    private static String user = "root";
    private static String password = "";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //获得连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    //释放资源
    public static void releaseAll(Connection conn, Statement st, ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (st != null) {
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
