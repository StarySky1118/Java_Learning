package com.zzy.interface_;

// 接口的多态传递机制
public class Test04 {
    public static void main(String[] args) {
        A a = new C();
        a.doSome();
    }
}

interface A {
    void doSome();
}

interface B extends A {

}

class C implements B {

    @Override
    public void doSome() {
        System.out.println("C 实现 A接口方法");
    }
}