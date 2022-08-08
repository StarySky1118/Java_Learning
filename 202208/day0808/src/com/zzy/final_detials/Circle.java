package com.zzy.final_detials;

// 圆形类
public class Circle {
    public final static double PI; // 圆周率

    static {
        PI = 3.14;
    }

    // 计算面积
    public static double countArea(double radius) {
        return PI * radius * radius;
    }
}
