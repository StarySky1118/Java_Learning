package com.zzy.staticmethod;

/**
 * 学生类
 * 每个学生的学费不同，但全体学生有总学费。
 */
public class Student {
    private String name; // 姓名
    private double fee; // 学费
    private static double total_fee; // 总学费

    // 构造器
    public Student(String name, double fee) {
        this.name = name;
        this.fee = fee;
        total_fee += fee;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        total_fee -= this.fee;
        this.fee = fee;
        total_fee += fee;
    }

    public static double getTotal_fee() {
        return total_fee;
    }
}
