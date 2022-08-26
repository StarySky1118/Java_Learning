package com.zzy.deadlock;

public class BThread implements Runnable{
    private static Object o1 = new Object();
    private static Object o2 = new Object();
    private boolean flag;

    // 构造器
    public BThread(boolean flag) {
        this.flag = flag;
    }


    @Override
    public void run() {
        if(flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "已获取o1资源");
                synchronized (o2) {
                    System.out.println(Thread.currentThread().getName() + "已获取o2资源");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "已获取o2资源");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "已获取o1资源");
                }
            }
        }
    }
}
