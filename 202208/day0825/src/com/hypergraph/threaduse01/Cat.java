package com.hypergraph.threaduse01;

// 猫线程
public class Cat extends Thread{
    @Override
    public void run() {
        int times = 0;

        while(true) {
            System.out.println("喵喵喵...");
            times++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break;
            }
        }
    }
}
