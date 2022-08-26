package com.zzy.homework01;

// 打印线程
public class PrintThread implements Runnable{

    private boolean loop = true;

    @Override
    public void run() {
        while(loop) {
            System.out.println(Utility.randomInt(0, 99));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(!loop) {
                break;
            }
        }
    }
}
