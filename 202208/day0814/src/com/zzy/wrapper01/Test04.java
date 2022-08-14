package com.zzy.wrapper01;

// Integer对象的创建机制
public class Test04 {
    public static void main(String[] args) {
        // new关键字产生新对象
//        Integer i = new Integer(1);
//        Integer j = new Integer(1);
//        System.out.println(i == j);

        // Integer类有256个对象缓冲数组
        Integer i = 1;
        Integer j = 1;
        System.out.println(i == j);

        Integer m = 128;
        Integer n = 128;
        System.out.println(m == n);
    }
}
