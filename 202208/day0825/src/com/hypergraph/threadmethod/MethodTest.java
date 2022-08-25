package com.hypergraph.threadmethod;

public class MethodTest {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        Thread thread = new Thread(t);

        // public final synchronized void setName(String name)
        // 设置线程名称
        thread.setName("枪杀白人线程");

        thread.start();

        Thread.sleep(3 * 1000);

        // public void interrupt()
        // 线程中断
        thread.interrupt();
    }
}
