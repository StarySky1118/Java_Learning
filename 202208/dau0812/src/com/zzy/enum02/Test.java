package com.zzy.enum02;

public class Test {
    public static void main(String[] args) {
        System.out.println(Cola.COCO);
        System.out.println(Cola.COCO.ordinal());

        int[] nums = {1, 3, 5, 6, 7};
        for (int i : nums) {
            System.out.println(i);
        }

        try {
            System.out.println(Cola.valueOf("CCC"));
        } catch (IllegalArgumentException e) {
            System.out.println("没有此枚举标签...");
        }

        System.out.println("程序继续执行...");

        System.out.println(Cola.COCO.compareTo(Cola.PESII));
    }
}
