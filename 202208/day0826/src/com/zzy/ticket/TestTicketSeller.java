package com.zzy.ticket;


public class TestTicketSeller {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new TicketSeller());
        Thread thread2 = new Thread(new TicketSeller());
        Thread thread3 = new Thread(new TicketSeller());

        thread1.setName("售票窗口1");
        thread2.setName("售票窗口2");
        thread3.setName("售票窗口3");
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
