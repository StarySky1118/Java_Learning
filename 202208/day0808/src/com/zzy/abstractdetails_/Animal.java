package com.zzy.abstractdetails_;

// 动物抽象类
public abstract class Animal {
    private String name; // 学名

    // 构造器
    public Animal(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 吃东西
    //public abstract void eat();

    // 移动
    public void move() {
        System.out.println("动物在移动....");
    }
}
