package com.zzy.static_.startup;

public class StaticTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("田所浩二");
        player1.join();
        System.out.println("当前房间玩家数量为:" + Player.getCount());

        Player player2 = new Player("田所浩三");
        player2.join();
        System.out.println("当前房间玩家数量为:" + Player.getCount());

        Player player3 = new Player("田所浩四");
        player3.join();
        System.out.println("当前房间玩家数量为:" + Player.getCount());
    }
}
