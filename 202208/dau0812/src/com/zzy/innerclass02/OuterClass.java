package com.zzy.innerclass02;

// 实例内部类
public class OuterClass {
    private String name;
    private static String uid;

    class InnerClass {
        public void m1() {
            System.out.println("InnerClass's m1()执行...");
        }
    }

    public InnerClass getInstance() {
        return new InnerClass();
    }

    static class InnerClass02 {
        public void m2() {
            System.out.println("InnerClass02's m2()执行...");
        }
    }
}
