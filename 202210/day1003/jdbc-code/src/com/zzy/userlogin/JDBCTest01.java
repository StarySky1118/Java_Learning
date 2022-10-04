package com.zzy.userlogin;

import com.zzy.JDBC.JDBCUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

// 使用 PreparedStatement 完成 DML操作
public class JDBCTest01 {
    public static void main(String[] args) {
    }

    @Test
    public void insertTest() {
        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            // 注册驱动
            Class.forName(driver);

            // 获取连接
            connection = DriverManager.getConnection(url, user, password);

            // 获取数据库操作对象
//            String sql = "insert into t_user (id, username, pwd, realname) values (2, 'zzy', '963258', 'b')";
            String sql = "update t_user set pwd = '123456' where username = 'zzy'";
            ps = connection.prepareStatement(sql);

            // 执行sql语句
            int count = ps.executeUpdate();

            System.out.println(count > 0 ? "修改成功！" : "修改失败！");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /**
     * sql 脚本
     * drop table if exists t_account;
     * create table t_account(
     *      actno int,
     *      balance double(7, 2)
     * );
     * insert into t_account (actno, balance) values (1, 10000);
     * insert into t_account (actno, balance) values (2, 0);
     */
    @Test
    public void transactionTest01() {
        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            // 注册驱动、获取连接
            connection = JDBCUtil.getConnection(url, user, password);

            // 取消事务自动提交
            connection.setAutoCommit(false);

            // 获取数据库操作对象
            String sql = "update t_account set balance = balance + 10 where actno = 1";
            ps = connection.prepareStatement(sql);

            // 执行sql语句
            int count = ps.executeUpdate();

            sql = "update t_account set balance = balance - 10 where actno = 2";
            ps = connection.prepareStatement(sql);

            // 执行sql语句
            count += ps.executeUpdate();

            System.out.println(count == 2 ? "转账成功！" : "转账失败！");

            // 转账成功，事务提交
            connection.commit();

        } catch (SQLException e) {
            // 出现异常，事务回滚
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        } finally {
            try {
                JDBCUtil.close(null, ps, connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
