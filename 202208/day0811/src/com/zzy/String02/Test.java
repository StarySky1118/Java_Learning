package com.zzy.String02;

public class Test {
    public static void main(String[] args) {
        // String对象的两种创建方式
        // 方式1：直接赋值
        String str1 = "wyq";

        // 方式2：使用各种构造器
        String str2 = new String("wyq");

        System.out.println(str1 == str2);

        System.out.println(str1 == str2.intern()); // T
        System.out.println(str2 == str1.intern()); // F
    }
}
