package com.zzy.arrays_;

import java.util.Arrays;

// 演示Arrays类方法
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, -5, 6};

        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(Arrays.binarySearch(arr, 4));

//        int[] b = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(b));

//        Arrays.fill(arr, 0, 3, 3);
//        System.out.println(Arrays.toString(arr));

        int[] b = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.equals(arr, b));
    }
}
