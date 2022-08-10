package com.zzy.enum02;

// 测试类
public class Test {
    public static void main(String[] args) {
        Season season1 = Season.SUMMER;
//        System.out.println(season.toString());
//        System.out.println(season.ordinal());

//        int[] nums = {3, 6, 9, 15};
//        for(int i : nums) {
//            System.out.println("i = " + i);
        Season season2 = Season.valueOf("WINTER");

        System.out.println(season1.compareTo(season2));
    }
}
