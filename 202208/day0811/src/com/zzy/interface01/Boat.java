package com.zzy.interface01;

// 船类
public class Boat implements Vehicles{
    private String type; // 船的类型

    // 构造器
    public Boat() {
    }

    public Boat(String type) {
        this.type = type;
    }

    // setter and getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 船行驶
    @Override
    public void work() {
        System.out.println("遇到大江大河，坐船...");
    }
}
