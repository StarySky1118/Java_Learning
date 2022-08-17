package com.zzy.homework02;

import java.util.Scanner;

// 工具类
public class Utility {

    public static void register() {
        Scanner scanner = new Scanner(System.in);
        String userInputStr = "";

        // 用户名键入
        System.out.print("请输入用户名：");
        userInputStr = scanner.next();
        if (userInputStr.length() < 2 || userInputStr.length() > 4) {
            throw new RuntimeException("用户名长度只能为2,3或4...");
        }

        // 密码键入
        System.out.print("请输入密码：");
        userInputStr = scanner.next();
        if(!(userInputStr.length()==6 && Utility.isAllDigit(userInputStr))) {
            throw new RuntimeException("密码长度为6且只能为数字...");
        }

        // 邮箱键入
        System.out.print("请输入邮箱：");
        userInputStr = scanner.next();
        if(!(userInputStr.contains("@") && userInputStr.contains(".") && userInputStr.indexOf('@') < userInputStr.indexOf('.'))) {
            throw new RuntimeException("邮箱格式不正确...");
        }

    }

    /**
     * 判断字符串str是否每个字符全为数字
     *
     * @param str 待判断字符串
     * @return true--字符串str每个字符全为数字 false--字符串str中的字符不全为数字
     */
    public static boolean isAllDigit(String str) {
        if (str == null) {
            throw new NullPointerException("字符串不能为空！");
        }

        for (int i = 0; i < str.length(); i++) {
            if (!(Character.isDigit(str.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
