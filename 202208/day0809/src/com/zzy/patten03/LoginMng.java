package com.zzy.patten03;

// 登录管理类
public class LoginMng extends UserLog{

    // 用户登录
    @Override
    public void login() {
        System.out.println("用户登录成功！");
    }

    // 用户注销
    @Override
    public void logout() {
        System.out.println("用户注销成功！");
    }
}
