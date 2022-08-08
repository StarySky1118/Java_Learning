package com.zzy.Patten02;

// 学生类
public class Student {
    private String name; // 姓名
    private int age; // 年龄

    private static Student student; // 私有引用属性

    // 构造器私有化：防止外部类创建对象
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 返回对象方法
    public static Student getInstance() {
        if (student == null) {
            student = new Student("田所浩二", 24);
        }
        return student;
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

    public static Student getStudent() {
        return student;
    }

    public static void setStudent(Student student) {
        Student.student = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
