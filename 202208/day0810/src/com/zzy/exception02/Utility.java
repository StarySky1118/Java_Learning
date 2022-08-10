package com.zzy.exception02;

import java.util.Scanner;

// 工具类
public class Utility {
    public static Scanner scanner = new Scanner(System.in);

    // 读整数
    public static int readInt() {
        String str;
        int userInputNum = 0;

        while(true) {
            System.out.print("请输入一个整数: ");
            str = scanner.next();

            try { // 尝试将输入的字符串转换为整数
                userInputNum = Integer.parseInt(str);
                break;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("输入的不是整数，请重新输入！");
            }
        }

        return userInputNum;
    }
}
