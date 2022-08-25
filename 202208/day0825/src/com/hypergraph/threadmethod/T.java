package com.hypergraph.threadmethod;

public class T implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName() + "执行完毕");
            try {
                System.out.println(Thread.currentThread().getName() + "休眠...");
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "休眠被中断!");
            }
        }
    }
}
