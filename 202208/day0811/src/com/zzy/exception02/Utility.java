package com.zzy.exception02;

import java.util.Scanner;

// 工具类
public class Utility {
    public static Scanner scanner = new Scanner(System.in); // 扫描器对象

    /**
     * 读入整数
     * 反复读入，直至用户输入整数
     * @return
     */
    public static int readInt() {
        int userInputNum = 0; // 用户输入整数
        String userInputStr; // 用户输入字符串

        while(true) {
            System.out.print("请输入整数: ");
            userInputStr = scanner.next();
            try {
                userInputNum = Integer.parseInt(userInputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数！");
            }
        }

        return userInputNum;
    }

    /**
     * 读入年龄
     * 年龄合理范围 [0, 120]
     * @return
     */
    public static int readAge() {
        int age;

        while(true) {
            age = readInt();


        }
    }
}
