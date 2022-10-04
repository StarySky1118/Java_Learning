package com.zzy.JDBC;

import java.sql.*;

/**
 * JDBC 工具类
 * 封装相关方法。
 */
public class JDBCUtil {
    // 构造方法私有化
    private JDBCUtil() {
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取数据库连接对象
     *
     * @param url      连接url
     * @param user     数据库用户名
     * @param password 数据库密码
     * @return 连接对象
     * @throws SQLException
     */
    public static Connection getConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放资源
     * @param rs 结果集
     * @param statement 数据库操作对象
     * @param connection 数据库连接对象
     * @throws SQLException
     */
    public static void close(ResultSet rs, Statement statement, Connection connection) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }
}
