package com.zzy.innerclass02;

// 测试匿名内部类的使用
public class Test {
    public static void main(String[] args) {
        new Skill() {
            @Override
            public void ski() {
                System.out.println("我会滑雪...");
            }
        }.ski();
    }
}
