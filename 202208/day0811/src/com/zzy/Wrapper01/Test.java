package com.zzy.Wrapper01;

public class Test {
    public static void main(String[] args) {
        Integer i = 100;

        // 方式1
        String str1 = i + "";

        // 方式2
        String str2 = i.toString();

        // 方式3
        String str3 = String.valueOf(i);

        // String-->包装类
        String str4 = "1234";

        // 方式1
        Integer i1 = Integer.parseInt(str4);

        // 方式2
        Integer i2 = new Integer(str4);
    }
}
