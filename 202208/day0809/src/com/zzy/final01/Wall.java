package com.zzy.final01;

// 墙类——演示最终实例变量的赋值
public class Wall {
//    private final int height = 2;
//    private final int height;
//
//    {
//        height = 2;
//    }
//    private final int height;
//
//    public Wall(int height) {
//        this.height = height;
//    }
    public static final int height = 1;

    static {
        System.out.println("类加载...");
    }
}
