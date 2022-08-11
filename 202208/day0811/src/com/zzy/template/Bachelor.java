package com.zzy.template;

// 本科生类
public class Bachelor extends Student{
    private int grade; // 年级

    // 构造器
    public Bachelor() {
    }

    public Bachelor(String name, String stuNo, int grade) {
        super(name, stuNo);
        this.grade = grade;
    }

    // setter and getter
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 上课
    @Override
    public void haveClass() {
        System.out.println("认真上课...");
    }

    // 吃饭
    @Override
    public void eat() {
        System.out.println("疯狂吃饭...");
    }
}
