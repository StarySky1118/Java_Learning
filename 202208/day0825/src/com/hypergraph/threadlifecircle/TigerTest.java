package com.hypergraph.threadlifecircle;

public class TigerTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Thread thread = new Thread(tiger);
        System.out.println("线程状态: " + thread.getState());

        thread.start();
        System.out.println("线程状态：" + thread.getState());

        while(thread.getState() != Thread.State.TERMINATED) {
            System.out.println("线程状态：" + thread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("线程状态：" + thread.getState());



    }
}
