package com.zzy.homework07;

// 人类
public class Person {
    private String name; // 姓名
    private char gender; // 性别
    private int age; // 年龄

    // 构造器
    public Person() {
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 玩方法
    public String play() {
        return "";
    }

    // 显示信息
    public void showInfo() {
        System.out.println("姓名:" + name + "\n" +
                           "年龄:" + age  + "\n" +
                           "性别" + gender);
    }
}
