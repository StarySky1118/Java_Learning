package com.zzy.abstractdetails_;

// 抽象类——人类
public abstract class Human {
    private String name; // 名字

    // 构造器
    public Human(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 吃饭方法
    public abstract void eat();

    // 睡觉方法
    public abstract void sleep();

    // 呼吸方法
    public void breathe() {
        System.out.println("呼吸...");
    }
}
