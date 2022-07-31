package com.zzy.debugtest;
// 断点调试数组越界
public class DebugTest01 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
