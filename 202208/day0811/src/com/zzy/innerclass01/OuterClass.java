package com.zzy.innerclass01;

public class OuterClass {
    private String name = "田所浩二";
    private static String uid = "114514";

    public void m1() {
        class InnerClass {
            public void doSome() {
                System.out.println(name + uid);
            }
        }
    }

    public static void m2() {

    }
}
