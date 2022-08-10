package com.zzy.static01;

public class Test {
    public static void main(String[] args) {
        Player p1 = new Player("田所浩二", "114514");
        Player p2 = new Player("田所浩三", "114514");
        Player p3 = new Player("田所浩四", "114514");

        p1.join();
        p2.join();
        p3.join();
    }
}
