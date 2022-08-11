package com.zzy.exception02;

public class Test {
    public static void main(String[] args) {
        int age = 123;

        if (age < 0 || age > 120) {
            throw new AgeException("年龄合理范围是 [0,120]");
        }
    }
}
