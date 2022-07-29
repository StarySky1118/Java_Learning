package com.pkg;

import java.util.Arrays;

public class ImportTest02 {
    public static void main(String[] args) {
        // 导入数组类进行排序
        int[] a = {4, 3, 2, 7, 9};
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
