package com.zzy.homework03;
// 普通员工类
public class OrdinaryEmployee extends Employee{
    // 构造器
    public OrdinaryEmployee() {
        setGrade(1.0);
    }

    public OrdinaryEmployee(String name, double salaryPerDay, int workingDays) {
        super(name, salaryPerDay, workingDays);
        setGrade(1.0);
    }

    // 打印工资
    @Override
    public void printSalary() {
        System.out.println("当月工资:" + getSalaryPerDay() * getWorkingDays() * getGrade());
    }
}
