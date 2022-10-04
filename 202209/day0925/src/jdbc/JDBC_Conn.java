package jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// 演示 mysql 连接五种方式
public class JDBC_Conn {
    // 第一种方式：直接使用 Driver 类
    @Test
    public void connect1() throws SQLException, IOException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        // mysql 用户名和密码
        String pro_path = "mysql.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(pro_path));
//        System.out.println(properties);
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);

        // 关闭连接
        connect.close();
    }

    // 第二种方式：反射机制
    @Test
    public void connect2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, IOException {
        // mysql 连接信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        String pro_path = "mysql.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(pro_path));

        // 创建 Class 对象
        Class aClass = Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取 Driver 对象
        Driver driver = (Driver) aClass.newInstance();

        // 获取 connect() 方法对象
        Method connect = aClass.getMethod("connect", String.class, Properties.class);
        Object invoke = connect.invoke(driver, url, properties);
        System.out.println(invoke);
    }

    // 第三种方式：使用 DriverManager
    @Test
    public void connect3() throws SQLException {
        // 数据库连接信息
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        String user = "root";
        String password = "991118";

        Driver driver = new Driver();
        // 注册驱动
        DriverManager.registerDriver(driver);
        // 获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }
}
