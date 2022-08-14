package com.zzy.array01;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] a = {1, -1, 3, 6, 2};
        // 静态方法 “排序”
//        Arrays.sort(a);

        // 静态方法toString()
//        System.out.println(Arrays.toString(a));

        // 静态方法 “二分查找”
        // public static int binarySearch(int[] a, int key)
        // 返回值 -(插入下标) - 1
//        System.out.println(Arrays.binarySearch(a, 1));
        // public static int binarySearch(int[] a, int fromIndex, int toIndex, int key)
        // 查找范围[fromIndex, toIndex)
//        System.out.println(Arrays.binarySearch(a,1, 3, 3));

        // 静态方法 “数组拷贝”
        // public static int[] copyOf(int[] original, int newLength)
        // 从 original 数组中拷贝 newLength 个元素到新数组中
//        System.out.println(Arrays.toString(a));
//        int[] b = Arrays.copyOf(a, 4);
//        System.out.println(Arrays.toString(b));

        // 静态方法 “数组填充”
        // public static void fill(int[] a, int val)
        // public static void fill(int[] a, int fromIndex, int toIndex, int val)
        // 向数组 a 的 [fromIndex, toIndex) 填充 val
//        Arrays.fill(a, 5, 0, 1);
//        System.out.println(Arrays.toString(a));

        // 静态方法 “判断是否相等”
        // public static boolean equals(int[] a, int[] a2)
        // 判断数组 a 和数组 a2 是否相等
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.equals(a, b));

        // 静态方法 “转换为list”


    }
}
