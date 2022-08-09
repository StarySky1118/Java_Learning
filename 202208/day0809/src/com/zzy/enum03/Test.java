package com.zzy.enum03;

import com.zzy.enum02.Season;

public class Test {
    public static void main(String[] args) {


        System.out.println("我曾经历过: ");
        System.out.println(com.zzy.enum02.Season.SPRING.getName() + "的" + com.zzy.enum02.Season.SPRING.getDesc());
        System.out.println(com.zzy.enum02.Season.SUMMER.getName() + "的" + com.zzy.enum02.Season.SUMMER.getDesc());
        System.out.println(com.zzy.enum02.Season.AUTUMN.getName() + "的" + com.zzy.enum02.Season.AUTUMN.getDesc());
        System.out.println(com.zzy.enum02.Season.WINTER.getName() + "的" + Season.WINTER.getDesc());
    }
}
