package com.zzy.abstract_;

// 动物类
public abstract class Animal {
    private String name; // 学名

    // 无参构造
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

    public abstract void eat();
}
