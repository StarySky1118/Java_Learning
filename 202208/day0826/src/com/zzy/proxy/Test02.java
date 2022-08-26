package com.zzy.proxy;

public class Test02 {
    public static void main(String[] args) {
        B b = new B();
        b.start();

        b.setName("子线程");

        for (int i = 1; i <= 10; i++) {
            System.out.println("main线程执行...第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i == 5) {
                try {
                    b.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

class B extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "执行...第" + i + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
