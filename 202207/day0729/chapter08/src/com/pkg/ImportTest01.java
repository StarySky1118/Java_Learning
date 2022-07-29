package com.pkg;

import java.util.Scanner; // 引入一个类
//也可以导入全部类

public class ImportTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int i = s.nextInt();
        System.out.println(i);
    }
}
