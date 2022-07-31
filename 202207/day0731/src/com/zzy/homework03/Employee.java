package com.zzy.homework03;
// 员工类
public class Employee {
    private String name; // 姓名
    private double salaryPerDay; // 单日工资
    private int workingDays; // 工作天数
    private double grade; // 等级

    // 构造器
    public Employee() {
    }

    public Employee(String name, double salaryPerDay, int workingDays) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.workingDays = workingDays;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // 打印工资
    public void printSalary() {
        System.out.println("输出当月工资");
    }
}
