package com.zzy.Template;

// 模板设计模式
public abstract class Template {
    private String name;
    private String uid;

    // 构造器
    public Template(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    // 打印所有信息方法
    public abstract void printInfo();

    // 信息打印UI
    public void printUI() {
        System.out.println("欢迎使用...");
        printInfo();
    }
}
