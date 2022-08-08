package com.zzy.abstract_;

// 猫类
public class Cat extends Animal {
    private String type; // 猫的种类

    // 构造器
    public Cat(String name, String type) {
        super(name);
        this.type = type;
    }

    // setter and getter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println(type + getName() +"吃猫粮");
    }
}
