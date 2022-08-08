package com.zzy.interface_;

// Oracle数据库
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("Oracle数据库连接...");
    }

    @Override
    public void close() {
        System.out.println("Oracle数据库关闭...");
    }
}
