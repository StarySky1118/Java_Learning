package com.zzy.template;

// 经理类
public class Manager extends Employee{
    private double bonus; // 奖金
    public final static String post = "经理"; // 职位

    // 构造器
    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // setter and getter
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 工资打印

    @Override
    public void printSalary() {
        System.out.println(getName() + "\t" + post + "\t" + getSalary() + "\t" + getBonus() + "\t" + (getSalary() + getBonus()));
    }
}
