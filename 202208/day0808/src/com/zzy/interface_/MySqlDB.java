package com.zzy.interface_;

// Mysql数据库
public class MySqlDB implements DBInterface{
 //   public static final String name = "MySQL数据库";

    @Override
    public void connect() {
        System.out.println("MySQL数据库连接...");
    }

    @Override
    public void close() {
        System.out.println("MySQL数据库关闭...");
    }

    // 特有方法
    public void call() {
        System.out.println("召唤老杜...");
    }
}
