package com.hypergraph.multithread;

// 猫类
public class Cat implements Runnable{
    @Override
    public void run() {

        int times = 0;
        while (true) {
            System.out.println("喵喵... " + "当前进程: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(++times == 10) {
                break;
            }
        }

    }
}
