package com.zzy.exception02;

// 演示类型转换异常
public class ClassCastException_ {
    public static void main(String[] args) {
        A a = new B();
        B b = (B) a;
        C c = (C) a;
    }
}

class A {}
class B extends A {}
class C extends A {}
