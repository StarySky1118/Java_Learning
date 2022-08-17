package com.zzy.homework03;

import java.util.Scanner;

// 工具类
public class Utility {
    /**
     * 接收键盘输入姓名并返回格式化后的姓名字符串
     * @return 格式化后的姓名字符串
     */
    public static String nameFormatter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入人名：");
        String name = scanner.next();

        // 分割
        String[] names = name.split(" ");

        if (!(names.length == 3)) {
            throw new RuntimeException("名字格式输入有误...");
        }

        // 创建StringBuilder对象并进行格式化
        StringBuilder sb = new StringBuilder();
        sb.append(names[2]).append(",").append(names[0]).append(".").append(names[1].charAt(0));

        return sb.toString();
    }
}
