package com.zzy.template;

// 抽象员工类
public abstract class Employee {
    private String name; // 姓名
    private String id;// ID
    private double salary; // 工资

    // 构造器
    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 打印工资
    public abstract void printSalary();

    // 打印工资信息条
    public void printSalaryBar() {
        System.out.println("--------您当月的工资如下--------");
        System.out.println("姓名\t职位\t基本工资\t奖金\t总工资");
        printSalary();
        System.out.println("--------您的工资显示完毕，如有异常，请联系人力部门--------");

    }
}
