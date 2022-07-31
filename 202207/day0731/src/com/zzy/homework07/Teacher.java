package com.zzy.homework07;

// 教师类
public class Teacher extends Person{
    private int work_age; // 工龄

    // 构造器
    public Teacher() {
    }

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    // setter and getter
    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    // 教学方法
    public void teach() {
        System.out.println("我承诺，我会认真教学。");
    }

    // 玩方法
    @Override
    public String play() {
        return getName() + "爱玩象棋";
    }

    // 显示信息

    @Override
    public void showInfo() {
        System.out.println("老师的信息:");
        super.showInfo();
        System.out.println("工龄:" + work_age);
        teach();
        play();
        System.out.println("===================");
    }
}
