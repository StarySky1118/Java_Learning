package com.debugtest;

// 断点调试：数组越界
public class DebugTest02 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("退出for循环");
    }
}
