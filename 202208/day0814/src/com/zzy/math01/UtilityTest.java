package com.zzy.math01;

public class UtilityTest {
    public static void main(String[] args) {
//        int[] nums = new int[101];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//
//        for (int i = 1; i <= 2000000; i++) {
//            int j = Utility.randomInt(0, 100);
//            nums[j]++;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(i + "出现的次数为: " + nums[i]);
//        }

        try {
            int i = Utility.randomInt(5, 2);
        } catch (Exception e) {
            System.out.println("无法生成...");
        }
    }
}
