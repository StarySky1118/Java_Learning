package com.zzy.homework02;
// 教授类
public class Professor extends Teacher{
    public static double salary_grade = 1.3; // 工资级别

    // 构造方法
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", post='" + getPost() + '\'' +
                ", salary=" + getSalary() * salary_grade +
                '}';
    }
}
