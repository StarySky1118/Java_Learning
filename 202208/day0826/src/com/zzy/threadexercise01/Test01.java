package com.zzy.threadexercise01;

public class Test01 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SonThread());
        thread.setDaemon(true);
        thread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("父线程执行...第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

class SonThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("子线程执行...第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}