package com.zzy.interface01;

// 马类
public class Horse implements Vehicles{
    private String name; // 品种
    private Color color; // 颜色

    // 构造器
    public Horse() {
    }

    public Horse(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    // 马儿赶路
    @Override
    public void work() {
        System.out.println("一般情况下，骑马赶路...");
    }
}
