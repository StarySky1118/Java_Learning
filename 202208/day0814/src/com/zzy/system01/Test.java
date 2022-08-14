package com.zzy.system01;

// 演示System类方法
public class Test {
    public static void main(String[] args) {
        System.out.println("鸡你太美...");

        // 静态方法 “退出”
        // public static void exit(int status)
        // 退出程序，返回值为 status，0表示正常状态
//        System.exit(1);
//        System.out.println("鸡你实在是太美");

        // 静态方法 “数组拷贝”
        // public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
        // Arrays.copyof()方法调用此方法

        // 静态方法 “当前毫秒数”
        // public static native long currentTimeMillis
        // 返回当前时间 - 1970-01-01 00:00 的毫秒数
        System.out.println(System.currentTimeMillis());

    }
}
