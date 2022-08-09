package com.zzy.staic_;

// 玩家测试类
public class Test {
    public static void main(String[] args) {
        Player p1 = new Player("田所浩二", "114514");
        Player p2 = new Player("德川", "1919810");

        p1.join();
        p2.join();

        System.out.println("当前在线人数为: " + Player.getTotalNum());
    }
}
