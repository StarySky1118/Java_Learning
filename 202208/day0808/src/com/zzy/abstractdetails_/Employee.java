package com.zzy.abstractdetails_;

// 员工抽象类
public abstract class Employee {
    private String name; // 姓名
    private String id; // ID
    private double salary; // 工资

    // 构造方法
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

    // 工作方法
    public abstract void work();
}
