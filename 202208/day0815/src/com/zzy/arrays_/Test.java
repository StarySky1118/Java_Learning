package com.zzy.arrays_;

import java.util.Arrays;
import java.util.Comparator;

// 演示Arrays类方法
public class Test {
    public static void main(String[] args) {
        int[] a = {1, -1, -3, 5, 8};

        Arrays.sort(a);

//        Arrays.sort(a, new Comparator());

//        System.out.println(Arrays.toString(a));

//        System.out.println(Arrays.binarySearch(a, -5));

//        for(int i : Arrays.copyOf(a, 4)) {
//            System.out.println(i);
//        }

        Arrays.fill(a, 0, 2, 99);
        System.out.println(Arrays.toString(a));

    }
}
