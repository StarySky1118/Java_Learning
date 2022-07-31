package com.debugtest;
// 动物类
public class Animal {
    // 名称
    private String name;
    // 年龄
    private int age;

    // 无参构造
    public Animal() {
    }

    // 有参构造
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter and geter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
