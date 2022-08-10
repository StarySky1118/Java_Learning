package com.zzy.innerclass03;

public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.new InnerClass().m1();
    }
}
