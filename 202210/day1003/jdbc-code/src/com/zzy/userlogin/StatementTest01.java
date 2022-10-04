package com.zzy.userlogin;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

public class StatementTest01 {
    public static void main(String[] args) {
        orderTest();
    }


    /**
     * 根据用户输入desc或asc将数据降序或升序显示
     */
    public static void orderTest() {
        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        // 获取用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入 desc(降序)/asc(升序)：");
        String order = scanner.nextLine();

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            // 注册驱动
            Class.forName(driver);

            // 获取连接
            connection = DriverManager.getConnection(url, user, password);

            // 获取数据库操作对象
            statement = connection.createStatement();

            // 执行 sql
            String sql = "select * from emp order by sal " + order + "";
            rs = statement.executeQuery(sql);

            // 处理查询结果
            while (rs.next()) {
                System.out.println(rs.getString("ename") + "," + rs.getString("sal"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if (statement != null) {
                try {
                    statement.close();
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
}
