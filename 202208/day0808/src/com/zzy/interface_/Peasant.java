package com.zzy.interface_;

// 农民抽象类
public abstract class Peasant{
    private String name; // 姓名
    private String id; // 身份证号

    // 构造器
    public Peasant() {
    }

    public Peasant(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 种地方法
    public abstract void farming();
}
