package com.zzy.interface_;

public interface MyInterface01 {
    default public void sleep() {
        System.out.println("Sleep...");
    }

    public static void doSome() {
        System.out.println("Do Something...");
    }
}
