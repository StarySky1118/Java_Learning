package com.hypergraph.threaduse01;

public class ThreadTest {
    public static void main(String[] args) {
        Cat cat = new Cat();

        /*
            1、
            public synchronized void start() {
                start0();
            }
            2、真正实现多线程的是start0方法
            private native void start0();
        */
        cat.start();

        for (int i = 0; i < 60; i++) {
            System.out.println(Thread.currentThread().getName() + "i=" + i);
        }
    }
}
