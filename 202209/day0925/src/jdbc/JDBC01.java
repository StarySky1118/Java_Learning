package jdbc;


import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC01 {
    public static void main(String[] args) throws SQLException {
        // 1、注册驱动
        Driver driver = null;
        try {
            driver = new Driver();
        } catch (SQLException e) {
            System.out.println("注册驱动失败！");
        }

        // 2、连接 MySQL
        // (1) jdbc:mysql: 协议名称
        // (2) localhost: IP 地址
        // (3) 3306: MySQL 监听的端口
        // (4) bjpowernode: 连接的数据库
        // (5) 本质就是 socket 连接
        String url = "jdbc:mysql://localhost:3306/bjpowernode?serverTimezone=GMT%2B8";
        // 用户名和密码放入 properties 对象
        Properties properties = new Properties();
        // use 和 password 键是规定好的
        properties.setProperty("user", "root");
        properties.setProperty("password", "991118");
        Connection connect = driver.connect(url, properties);

        // 3、执行 crud
        String sql = "insert into emp2 (empno, ename) values (3306, '张三')";
        // 执行静态 sql 语句
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);
        if (i > 0) {
            System.out.println("数据项插入成功！");
        }

        // 4、关闭 MySQL
        statement.close();
        connect.close();
    }
}
