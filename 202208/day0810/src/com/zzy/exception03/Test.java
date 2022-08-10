package com.zzy.exception03;

public class Test {
    public static void main(String[] args) {
        try {
            A.hi();
        } catch (NullPointerException e) {
            System.out.println("空指针了，程序崩了...");
        }
    }
}
