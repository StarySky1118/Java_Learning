package com.zzy.exception02;

public class Test02 {
    public static void main(String[] args) {
        String name = "田所浩二";

        try {
            int number = Integer.parseInt(name);
            System.out.println(number);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("异常信息: " + e.getMessage());
        } finally {
            System.out.println("关闭数据库...");
        }

        System.out.println("程序继续执行...");
    }
}
