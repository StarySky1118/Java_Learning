package com.hypergraph.syn01;

public class TicketSeller implements Runnable {
    private int ticketNum = 50; // 余票量

    /**
     * 操作余票量方法
     */
    public synchronized boolean manipulateTicketNum() {
        if (ticketNum <= 0) {
            return false;
        }
        ticketNum--;
        System.out.println("出票成功！当前余票：" + ticketNum);
        return true;
    }


    @Override
    public void run() {
        while(true) {
            boolean flag = manipulateTicketNum();
            if(!flag) {
                System.out.println("售票结束！");
                break;
            }
        }
    }
}
