package com.zzy.homework02;
// 测试类
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Professor("田所浩二", 24, "讲师", 100);
        System.out.println(teacher.introduce());
    }
}
