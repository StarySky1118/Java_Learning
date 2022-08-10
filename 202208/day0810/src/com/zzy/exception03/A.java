package com.zzy.exception03;

public class A {
    public static void hi() throws NullPointerException{
        String name = null;
        System.out.println(name.length());
        System.out.println("A's hi()");
    }
}
