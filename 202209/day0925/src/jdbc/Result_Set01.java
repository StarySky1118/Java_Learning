package jdbc;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ResourceBundle;

public class Result_Set01 {
    @Test
    public void query01() {
        // 数据库连接信息
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql01");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String user = resourceBundle.getString("user");
        String password = resourceBundle.getString("password");

        Connection connection = null;
        Statement statement = null;
        try {
            // 注册驱动
            Class.forName(driver);

            // 获取连接
            connection = DriverManager.getConnection(url, user, password);

            // 获取数据库操作对象
            statement = connection.createStatement();

            // 执行sql
            String sql = "select * from dept";
            ResultSet resultSet = statement.executeQuery(sql);

            // 处理查询结果
            while (resultSet.next()) {
                String deptNo = resultSet.getString(1);
                String dName = resultSet.getString("dname");
                String loc = resultSet.getString(3);
                System.out.println(deptNo + "," + dName + "," + loc);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
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
