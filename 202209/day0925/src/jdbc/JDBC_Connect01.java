package jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

public class JDBC_Connect01 {
    // 使用DriverManager类直接连接数据库
    @Test
    public void connect01() {
        // 数据库连接信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        String username = "root";
        String password = "991118";

        // 连接数据库
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(connection);

        // 关闭连接
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 复制表
    @Test
    public void insertTest() {
        Connection connection = null; // 数据库连接
        Statement statement = null; // 数据库操作对象

        try {
            // 注册驱动
            DriverManager.registerDriver(new Driver());

            // 连接数据库
            String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
            connection = DriverManager.getConnection(url, "root", "991118");

            // 获取数据库操作对象
            statement = connection.createStatement();

            // 执行SQL语句
            String sql = "insert into dept (deptno, dname, loc) values (50, '销售部', '上海')";
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1 ? "插入成功！" : "插入失败");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
            try {
                if(statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if(statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 更新测试
    @Test
    public void updateTest() {
        Connection connection = null; // 数据库连接
        Statement statement = null; // 数据库操作对象

        try {
            // 注册驱动
            //DriverManager.registerDriver(new Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 获取连接
            String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
            connection = DriverManager.getConnection(url, "root", "991118");

            // 获取数据库操作对象
            statement = connection.createStatement();

            // 执行SQL语句
            String sql = "update dept set dname = '市场部' where deptno = 50";
            int count = statement.executeUpdate(sql);

            System.out.println(count == 1 ? "修改成功！" : "修改失败！");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("类未找到！");
        } finally {
            // 关闭连接
            try {
                if(statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void connectTest1() {
        // 使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("mysql01");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection connection = null;
        try {
            // 注册驱动
            Class.forName(driver);

            // 获取连接
            connection = DriverManager.getConnection(url, user, password);

            System.out.println(connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭连接
            try {
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
