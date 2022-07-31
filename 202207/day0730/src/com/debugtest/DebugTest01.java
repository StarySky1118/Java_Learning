package com.debugtest;

// 测试断点调试的使用
public class DebugTest01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println("for结束...");
    }
}
