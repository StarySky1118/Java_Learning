package com.zzy.final01;

public class Student {
    private final String name;

    public static final String uid = "114514";

//    public Student(String name) {
//        this.name = name;
//    }

    {
        name = "田所浩二";
    }

    static {
        System.out.println("类加载...");
    }
}
