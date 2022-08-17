package com.zzy.homework02;

import java.util.Scanner;

// 用户类
public class User {
    private String userName; // 用户名
    private String pwd; // 密码
    private String email; // 邮箱

    // 构造器私有化
    private User() {
    }

    private User(String userName, String pwd, String email) {
        this.userName = userName;
        this.pwd = pwd;
        this.email = email;
    }

    // 用户注册方法
    public static User register() {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);

        // 键入用户名
        System.out.println("请输入用户名(长度只能为2/3/4)：");
        String inputUserName = scanner.next();
        if (!(inputUserName.length() == 3 || inputUserName.length() == 4 || inputUserName.length() == 5)) {
            throw new RuntimeException("用户名长度不正确...");
        }

        // 键入密码
        System.out.println("请输入密码(长度为6且全为数字)：");
        String inputPwd = scanner.next();
        if (!(inputPwd.length() == 6 && Utility.isAllDigit(inputPwd))) { // 非法密码
            throw new RuntimeException("密码格式不正确...");
        }

        // 键入邮箱
        System.out.println("请输入邮箱：");
        String inputEmail = scanner.next();
        if (!(inputEmail.contains("@") && inputEmail.contains(".") && inputEmail.indexOf('@') < inputEmail.indexOf('.'))) {
            throw new RuntimeException("邮箱格式不正确...");
        }

        System.out.println("用户" + inputUserName + "注册成功！");

        return new User(inputUserName, inputPwd, inputEmail);
    }

    // getter方法
    public String getUserName() {
        return userName;
    }

    public String getPwd() {
        return pwd;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
