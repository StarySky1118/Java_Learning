package com.zzy.innerclass;

// 匿名内部类的使用
public class Test {
    public static void main(String[] args) {

        // 基于抽象类的匿名内部类
        Father father = new Father("田所浩二") {
            @Override
            public void m1() {
                System.out.println(getName() + "Father's m1()执行...");
            }
        };
        father.m1();

        // 基于接口的匿名内部类
        new Flyable() {

            @Override
            public void fly() {
                System.out.println("我要飞我要飞...");
            }
        }.fly();
    }
}
