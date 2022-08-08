package com.zzy.abstractdetails_;

// 经理类
public class Manager extends Employee {
    private double bonus; // 奖金

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

    // 工作方法

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中...");
    }
}
