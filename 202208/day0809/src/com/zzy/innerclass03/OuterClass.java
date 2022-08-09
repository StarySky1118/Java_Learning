package com.zzy.innerclass03;

// 演示静态内部类
public class OuterClass {
    private static String name = "田所浩二";
    private String uid = "114514";

    public static class InnerClass {
        public void hi() {
            System.out.println("对所有的烦恼说拜拜~");
            System.out.println("名字事: " + name);
//            System.out.println("uid事: " + uid);
        }
    }

    public static InnerClass getInstanceofInnerClass() {
        return new InnerClass();
    }
}
