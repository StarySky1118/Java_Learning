package com.zzy.staticmethod;

public class StaticMethodTest {
    public static void main(String[] args) {
        Student student1 = new Student("田所浩二", 114514);
        Student student2 = new Student("田所浩三", 1919810);

        System.out.println("当前学生总学费为: " + Student.getTotal_fee());
    }
}
