package com.hypergraph.hashset01;

import java.util.Objects;

// 员工类
public class Employee {
    private String name; // 姓名
    private int age; // 年龄

    // 构造器
    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 指向同一个对象
        if (o == null || getClass() != o.getClass()) return false; // 类型不匹配
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
