package com.debugtest;

import java.util.Arrays;

public class DebugTest03 {
    public static void main(String[] args) {
        int[] array = {10, 5, 6, 2, 11, 13};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
