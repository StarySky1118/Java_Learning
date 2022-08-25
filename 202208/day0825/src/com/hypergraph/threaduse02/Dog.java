package com.hypergraph.threaduse02;

public class Dog implements Runnable{
    @Override
    public void run() {

        int times = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "执行次数: " + (++times));
            if(times == 20) {
                break;
            }
        }

    }
}
