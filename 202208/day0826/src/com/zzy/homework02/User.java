package com.zzy.homework02;

// 用户类
public class User implements Runnable {
    private static int balance = 10000; // 余额

    // 取钱方法
    public synchronized boolean withdraw() {
        if (balance <= 0) {
            return false;
        }
        balance -= 1000;
        System.out.println(Thread.currentThread().getName() + "取钱成功！当前余额: " + balance);
        return true;
    }

    @Override
    public void run() {
        while (true) {
            boolean flag = withdraw();
            if(!flag) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
