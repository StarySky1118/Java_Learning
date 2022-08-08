package com.zzy.final_detials;

// 学生类
public class Student {
    public final double FEE = 1000; // 学费

    public final static double TAX = 1000;

    static {
        System.out.println("Student类加载！！");
    }
//    static {
//        TAX = 5000;
//    }
//
//    {
//        FEE = 1000;
//    }
//    public Student() {
//        FEE = 1000;
//    }
}
