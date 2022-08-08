package com.zzy.template;

// 猫类
public class Cat extends Animal{
    public final static String name = "猫"; // 名称
    private String type; // 类型

    // 构造器
    public Cat() {
    }

    public Cat(String type) {
        this.type = type;
    }

    // setter and getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 吃东西
    @Override
    public void eat() {
        System.out.println(type + name + "正在吃猫粮...");
    }
}
