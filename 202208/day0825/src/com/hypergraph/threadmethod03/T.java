package com.hypergraph.threadmethod03;

public class T implements Runnable{

    @Override
    public void run() {
        while(true) {
            System.out.println("子进程执行...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
