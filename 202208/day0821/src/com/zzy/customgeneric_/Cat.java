package com.zzy.customgeneric_;

public class Cat<E> {
    // 泛型方法
    public<T> void run(T t, E e) {
        System.out.println(t.getClass());
        System.out.println(e.getClass());
    }
}
