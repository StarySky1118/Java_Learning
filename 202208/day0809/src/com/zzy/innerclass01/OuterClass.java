package com.zzy.innerclass01;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

// 演示局部内部类
public class OuterClass {
    private String name = "田所浩二";

    private static String id = "114514";

    // 构造器
    public OuterClass(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void m1() {
        class InnerClass01 {
            private String name = "德川";


            public void show() {
                System.out.println("内部类名字: " + name + "外部类名字: " + OuterClass.this.name);
            }
        }

        InnerClass01 innerClass01 = new InnerClass01();
        innerClass01.show();
    }

    public void m2() {

    }
}
