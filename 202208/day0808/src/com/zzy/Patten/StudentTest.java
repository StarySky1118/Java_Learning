package com.zzy.Patten;

// 学生类测试类
public class StudentTest {
    public static void main(String[] args) {
        Student student = Student.getInstance();
        System.out.println(student);
        student.setAge(25);
        System.out.println(student);
    }
}
