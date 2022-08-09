package com.zzy.patten03;

// 用户登录类
public abstract class UserLog {

    // 用户登录
    public abstract void login();

    // 用户注销
    public abstract void logout();

    // 登录界面
    public void logUI() {
        System.out.println("欢迎使用鹰角网络...");
        login();
        logout();
    }
}
