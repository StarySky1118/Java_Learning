package com.zzy.Patten;

// 学生类
public class Student {
    private String name; // 姓名
    private int age; // 年龄
    private char gender; // 性别

    // 在类的内部创建对象
    private final static Student student = new Student("田所浩二", 24, '男');

    // 构造器私有化
    private Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // 返回对象的方法
    public static Student getInstance() {
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
