package com.zzy.homework01;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(Utility.reverse01("HelloWorld"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
