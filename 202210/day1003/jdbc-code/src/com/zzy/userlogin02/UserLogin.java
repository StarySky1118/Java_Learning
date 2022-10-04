package com.zzy.userlogin02;

import com.zzy.JDBC.JDBCUtil;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 用户登录模块
public class UserLogin {
    public static void main(String[] args) {
        // 界面显示、接收传入的账号密码
        Map<String, String> userLoginInfo = loginUI();

        // 验证
        boolean loginSuccess = verifyLoginInfo(userLoginInfo);

        // 验证结果显示
        System.out.println(loginSuccess ? "登录成功！" : "登陆失败！");
    }

    /**
     * 登录验证模块
     * @param userLoginInfo 用户登录信息
     * @return 是否登录成功
     */
    private static boolean verifyLoginInfo(Map<String, String> userLoginInfo) {
        boolean loginSuccess = false; // 登录是否成功
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        String username = userLoginInfo.get("username");
        String password = userLoginInfo.get("password");

        try {
            // 注册驱动、获取连接
            connection = JDBCUtil.getConnection("jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8", "root", "991118");

            // 获取数据库操作对象
            statement = connection.createStatement();
            String sql = "select * from t_user where username = '"+username+"' and pwd = '"+password+"'";

            // 执行sql
            rs = statement.executeQuery(sql);

            // 处理查询结果集
            if(rs.next()) {
                loginSuccess = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
            try {
                JDBCUtil.close(rs, statement, connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return loginSuccess;
    }

    /**
     * 登录界面模块
     * @return 用户登录信息
     */
    private static Map<String, String> loginUI() {
        // 输入账号和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入账号：");
        String username = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();

        // 封装成 userLoginInfo
        Map<String, String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("username", username);
        userLoginInfo.put("password", password);

        return userLoginInfo;
    }
}
