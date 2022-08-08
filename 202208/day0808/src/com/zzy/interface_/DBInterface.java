package com.zzy.interface_;

// 数据库接口
public interface DBInterface {
    String name = "数据库接口";

    // 连接数据库
    void connect();

    // 关闭数据库
    void close();
}
