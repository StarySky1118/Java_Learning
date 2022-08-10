package com.zzy.innerclass03;

// 外部类
public class OuterClass {
    class InnerClass {
        public void m1() {
            System.out.println("内部类的m1()执行...");
        }
    }

    public InnerClass getInstance() {
        return new InnerClass();
    }
}
