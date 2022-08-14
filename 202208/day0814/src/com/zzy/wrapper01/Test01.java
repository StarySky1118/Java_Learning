package com.zzy.wrapper01;

// 演示包装类拆箱、装箱方法
public class Test01 {
    public static void main(String[] args) {
        // 手动装箱
//        Integer integer = Integer.valueOf(100);

        // 手动拆箱
//        int i = integer.intValue();

        // 自动装箱
        Integer integer = 100;

        // 自动拆箱
        int i = integer;
    }
}
