package com.hypergraph.multithread;

public class Dog implements Runnable{

    @Override
    public void run() {

        int times = 0;
        while(true) {
            System.out.println("汪汪... " + "当前线程: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(++times == 5) {
                break;
            }
        }

    }
}
