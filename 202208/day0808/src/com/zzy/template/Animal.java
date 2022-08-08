package com.zzy.template;

// 抽象动物类
public abstract class Animal {
    // 构造器
    public Animal() {
    }

    // 吃东西
    public abstract void eat();

    // 进食过程
    public void eatProcess() {
        System.out.println("进食开始...");
        eat();
        System.out.println("进食结束...");
    }
}
