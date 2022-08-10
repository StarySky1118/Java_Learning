package com.zzy.innerclass01;

// 测试局部内部类
public class Student {
    private String name; // 姓名
    private int age; // 年龄

    // 构造器
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter and getter
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

    public void m1() {

        class InnerClass {
            private String name;


        }

    }
}
