package com.hypergraph.threadmethod02;

public class T implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("子线程结束！");
    }
}
