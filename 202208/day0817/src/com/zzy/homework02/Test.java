package com.zzy.homework02;

public class Test {
    public static void main(String[] args) {
        try {
            Utility.register();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
