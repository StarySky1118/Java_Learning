package com.zzy.template;

// 学生抽象类
public abstract class Student {
    private String name; // 姓名
    private String stuNo; // 学号

    // 构造器
    public Student() {
    }

    public Student(String name, String stuNo) {
        this.name = name;
        this.stuNo = stuNo;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    // 上课
    public abstract void haveClass();

    // 吃饭
    public abstract void eat();

    // 度过一天
    public void spendDay() {
        System.out.println("起床");
        eat();
        haveClass();
        System.out.println("睡觉");
    }
}
