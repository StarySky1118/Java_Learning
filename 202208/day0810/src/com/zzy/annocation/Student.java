package com.zzy.annocation;

@SuppressWarnings({"all"})
public class Student {
    private String name;

    // 构造器
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
