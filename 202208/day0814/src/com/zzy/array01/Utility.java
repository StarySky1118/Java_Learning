package com.zzy.array01;

import java.util.Comparator;

// 工具类
public class Utility {

    /**
     * 冒泡排序
     *
     * @param arr 排序数组
     */
//    public static void bubbleSort(int[] arr) {
//        int temp;
//
//        for (int i = arr.length - 1; i >= 1; i--) { // 从最后一个位置到第二个位置
//            boolean flag = false;
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) { // 左比右大
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    flag = true;
//                }
//            }
//            if (!flag) { // 本趟排序未进行交换
//                break;
//            }
//        }
//    }

    public static void bubbleSort(int[] arr, Comparator c) {
        int temp;

        for (int i = arr.length - 1; i >= 1; i--) { // 从最后一个位置到第二个位置
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (c.compare(arr[j], arr[j+1]) > 0) { // 左比右大
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) { // 本趟排序未进行交换
                break;
            }
        }
    }
}
