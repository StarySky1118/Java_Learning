package com.zzy.ticket;

// 售票窗口类
public class TicketSeller implements Runnable{
    private static int availableTicket = 20; // 余票

    public synchronized boolean sellTicket() {
        if(availableTicket <= 0) { // 没有余票
            return false;
        }
        availableTicket--;
        System.out.println(Thread.currentThread().getName() + "出票成功！当前余票：" + availableTicket);
        return true;
    }

    @Override
    public void run() {
        boolean flag = true;
        while(flag) {
            flag = sellTicket();

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
