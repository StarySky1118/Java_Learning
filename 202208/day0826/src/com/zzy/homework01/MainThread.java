package com.zzy.homework01;

public class MainThread {
    public static void main(String[] args) {
        Thread printThread = new Thread(new PrintThread());
        Thread readThread = new Thread(new ReadThread());
        printThread.setDaemon(true);

        printThread.start();
        readThread.start();
    }
}
