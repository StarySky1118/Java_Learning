package com.zzy.userlogin;

import com.zzy.JDBC.JDBCUtil;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBCTest02 {
    // 测试模糊查询的使用
    @Test
    public void Test01() {
        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            // 获取连接
            connection = JDBCUtil.getConnection(url, user, password);

            // 获取数据操作对象
            String sql = "select * from emp where ename like ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, "_m%"); // 名字第二个字母为a

            // 执行SQL语句
            rs = ps.executeQuery();

            // 处理查询结果
            while (rs.next()) {
                System.out.println(rs.getString("ename") + "\t" + rs.getString("sal"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
            try {
                JDBCUtil.close(rs, ps, connection);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
