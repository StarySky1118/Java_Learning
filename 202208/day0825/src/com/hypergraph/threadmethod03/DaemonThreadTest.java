package com.hypergraph.threadmethod03;

public class DaemonThreadTest {
    public static void main(String[] args) {

        T t = new T();
        Thread thread = new Thread(t);
        // public final void setDaemon(boolean on)
        // 设置守护线程
        thread.setDaemon(true);
        thread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("父线程执行...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
