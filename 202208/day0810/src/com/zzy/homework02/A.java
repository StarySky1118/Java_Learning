package com.zzy.homework02;

public class A {
    private String name = "德川";

    public void a() {
        class B {
            private static final String name = "田所浩二";

            public void show() {
                System.out.println(A.this.name);
            }
        }
    }
}
