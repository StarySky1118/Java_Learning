package com.zzy.homework03;

// 部门经理类
public class DepartmentManager extends Employee {
    // 构造器
    public DepartmentManager() {
        setGrade(1.2);
    }

    public DepartmentManager(String name, double salaryPerDay, int workingDays) {
        super(name, salaryPerDay, workingDays);
        setGrade(1.2); // 单独设置等级为1.2
    }

    @Override
    // 打印工资
    public void printSalary() {
        System.out.println("当月工资:" + (getSalaryPerDay() * getWorkingDays() * getGrade() + 1000));
    }
}
