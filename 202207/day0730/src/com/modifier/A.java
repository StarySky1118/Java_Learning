package com.modifier;

public class A {
    public int n1; // 在任何地方都可以访问
    protected int n2; // 在同类、子类和同一个包中的类中可以访问
    int n3; // 在同类和同一包中的类中可以访问
    private int n4; // 只能在本类中访问
}
