package jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_Connect_Test {
    // 直接使用 Driver 类连接数据库
    @Test
    public void connect1() {
        // 数据库信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "991118");

        // 1、注册驱动
        Driver driver = null;
        try {
            driver = new Driver();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 2、进行连接
        Connection connect = null;
        try {
            connect = driver.connect(url, properties);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 3、进行增删改查

        // 4、关闭连接
        try {
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 使用反射机制连接数据库
    @Test
    public void connect2() {
        // 数据库信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "991118");

        // 创建 Driver 类的 Class 对象
        Class DriverClass = null;
        try {
            DriverClass = Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 使用 Driver 类的 Class 对象创建 Driver 实例
        Driver driver = null;
        try {
            driver = (Driver) DriverClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        // 连接
        Connection connect = null;
        try {
            connect = driver.connect(url, properties);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(connect);

        // 关闭连接
        try {
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 使用 DriverManager 进行管理
    @Test
    public void connect3() {
        // 读取数据库信息
        Properties url_properties = new Properties();
        try {
            url_properties.load(new FileInputStream("url.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String url1 = url_properties.getProperty("url");
//        System.out.println(url1);
        Properties mysql_properties = new Properties();
        try {
            mysql_properties.load(new FileInputStream("mysql.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(mysql_properties);

        // 注册驱动
        Driver driver = null;
        try {
            driver = new Driver();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 使用 DriverManager 管理这个驱动
        try {
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 获取连接
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url1, mysql_properties);
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

    // 创建 Driver 的 Class 类对象，自动进行驱动注册
    // 直接使用 DriverManager 获取连接
    @Test
    public void connect4() {
        // 数据库连接信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "991118");

        // 创建 Driver 的 Class 类对象
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("该类未找到！");
//        }

        // 使用 DriverManager 类获取连接
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, properties);
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


}
