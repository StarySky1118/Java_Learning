package com.hypergraph.threadmethod02;

public class MainThread {
    public static void main(String[] args) {

        T t = new T();
        Thread thread = new Thread(t);

        thread.start();


        for (int i = 1; i <= 10; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i==5) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("主线程结束！");
    }
}
