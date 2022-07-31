package com.zzy.homework07;

// 学生类
public class Student extends Person{
    private String stu_id; // 学号

    // 构造器
    public Student() {
    }

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    // setter and getter
    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    // 学习方法
    public void study() {
        System.out.println("我承诺，我会好好学习。");
    }

    // 玩方法
    @Override
    public String play() {
        return getName() + "爱玩足球";
    }

    // 显示信息方法
    @Override
    public void showInfo() {
        System.out.println("学生的信息：");
        super.showInfo();
        study();
        play();
        System.out.println("===================");
    }
}
