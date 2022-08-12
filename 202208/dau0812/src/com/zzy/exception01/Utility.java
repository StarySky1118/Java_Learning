package com.zzy.exception01;

import java.util.Scanner;

// 工具类
public class Utility {
    public static Scanner scanner = new Scanner(System.in); // 扫描器

    // 读入整数方法
    public static int readInt() {
        String str; // 用户键入字符串
        int userInputNum; // 用户键入整数

        while(true) {
            System.out.print("请输入一个整数: ");
            str = scanner.next();

            try {
                userInputNum = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数！");
            }
        }

        return userInputNum;
    }
}
