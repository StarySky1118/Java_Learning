package com.zzy.homework02;

public class WithdrawTest {
    public static void main(String[] args) {
        User user = new User();

        Thread thread1 = new Thread(user);
        Thread thread2 = new Thread(user);

        thread1.start();
        thread2.start();


    }
}
