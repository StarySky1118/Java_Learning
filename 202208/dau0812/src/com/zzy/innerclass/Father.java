package com.zzy.innerclass;

// 抽象父类
public abstract class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void m1();
}
