package com.zzy.threadstate;

public class ThreadStateTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new SonThread());

        System.out.println("进程状态：" + thread.getState());

        thread.start();

        System.out.println("进程状态：" + thread.getState());

        while(thread.getState() != Thread.State.TERMINATED) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("进程状态：" + thread.getState());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
