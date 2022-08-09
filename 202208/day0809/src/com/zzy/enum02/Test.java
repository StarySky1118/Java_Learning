package com.zzy.enum02;

public class Test {
    public static void main(String[] args) {
        System.out.println("我曾经历过: ");
        System.out.println(Season.SPRING.getName() + "的" + Season.SPRING.getDesc());
        System.out.println(Season.SUMMER.getName() + "的" + Season.SUMMER.getDesc());
        System.out.println(Season.AUTUMN.getName() + "的" + Season.AUTUMN.getDesc());
        System.out.println(Season.WINTER.getName() + "的" + Season.WINTER.getDesc());
    }
}
