package com.hypergraph.threadmethod01;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();

        Thread thread = new Thread(t);
        
        thread.start();

        for (int i = 0; i < 20; i++) {

            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i == 4) {
                // public final void join() throws InterruptedException
                // 线程插队：让线程thread完成所有任务后再执行本线程
//                thread.join();

                // public static native void yield()
                // 线程礼让，让出cpu
                Thread.yield();
            }
        }

    }
}
