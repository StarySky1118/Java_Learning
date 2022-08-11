package com.zzy.interface01;

// 飞机类
public class Plane implements Vehicles{
    private String name; // 飞机型号

    // 构造器
    public Plane() {
    }

    public Plane(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 飞机飞行
    @Override
    public void work() {
        System.out.println("坐飞机过火焰山...");
    }

}
