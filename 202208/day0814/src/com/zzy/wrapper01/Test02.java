package com.zzy.wrapper01;

// 演示String 与 包装类的转换
public class Test02 {
    public static void main(String[] args) {
        // String --> 包装类
//        String str = "1234";

        // 方式1：调用静态方法parseInt()
//        Integer integer = Integer.parseInt(str);

        // 方式2：调用构造器
//        Integer integer = new Integer(str);

        // 包装类 --> String
        Integer integer = 100;

        // 方式1：调用静态方法valueOf()
//        String str = String.valueOf(integer);

        // 方式2：调用实例方法toString()
//        String str = integer.toString();

        // 方式3：直接拼接
//        String str = "" + integer;

    }
}
