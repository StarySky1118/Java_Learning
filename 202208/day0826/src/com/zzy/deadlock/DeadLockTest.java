package com.zzy.deadlock;

public class DeadLockTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new BThread(true));
        Thread thread2 = new Thread(new BThread(false));

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}
