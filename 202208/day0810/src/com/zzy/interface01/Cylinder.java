package com.zzy.interface01;

// 圆柱体类
public class Cylinder implements C {
    private double radius; // 底圆半径
    private double height; // 高度
    private String color; // 颜色

    // 构造器
    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    // setter and getter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    // 计算面积
    @Override
    public double area() {
        return 2 * PI * radius * radius + 2 * PI * radius * height;
    }

    // 设置颜色
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    // 计算体积
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}
