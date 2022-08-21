package com.zzy.genericexercise02_;

// 员工类
public class Employee {
    private String name; // 姓名
    private double sal; // 薪水
    private MyDate birthday; // 生日

    // 构造器
    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday.getYear() + "-" + birthday.getMonth() + "-" + birthday.getDay() +
                '}';
    }
}
