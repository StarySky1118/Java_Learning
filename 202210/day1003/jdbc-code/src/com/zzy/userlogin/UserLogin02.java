package com.zzy.userlogin;

import java.sql.*;
import java.util.Hashtable;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UserLogin02 {
    public static void main(String[] args) {
        // 初始化界面
        Map<String, String> userLoginInfo = loginUI();

        // 验证用户名和密码
        // 密码输入：fas' or '1' = '1
        boolean loginSuccess = userLoginVerify(userLoginInfo);

        // 返回验证结果
        System.out.println(loginSuccess ? "登录成功！" : "用户名或密码错误");
    }

    /**
     * 用户登录信息验证
     *
     * @param userLoginInfo 用户登录信息
     * @return 是否登录成功
     */
    private static boolean userLoginVerify(Map<String, String> userLoginInfo) {
        boolean loginSuccess = false;

        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection connection = null;
        //Statement statement = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 注册驱动
            Class.forName(driver);

            // 获取连接
            connection = DriverManager.getConnection(url, user, password);

            // 获取数据库操作对象
            String sql = "select * from t_user where username = ? and pwd = ?";
            ps = connection.prepareStatement(sql);

            // 给占位符赋值
            ps.setString(1, userLoginInfo.get("userName"));
            ps.setString(2, userLoginInfo.get("pwd"));

            // 执行sql
            rs = ps.executeQuery();

            // 处理结果集
            if(rs.next()) {
                loginSuccess = true;
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

        return loginSuccess;
    }

    /**
     * 用户登录界面
     *
     * @return 用户登录信息
     */
    private static Map<String, String> loginUI() {
        // 读取用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("用户名：");
        String userName = scanner.nextLine();
        System.out.print("密码：");
        String pwd = scanner.nextLine();

        // 组装
        Map<String, String> userLoginInfo = new Hashtable<>();
        userLoginInfo.put("userName", userName);
        userLoginInfo.put("pwd", pwd);
        return userLoginInfo;
    }
}
