package com.zzy.static_.startup;

// 玩家类
public class Player {
    private String name; // 姓名
    private static int count = 0; // 玩家计数

    // 构造器
    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    // 加入游戏
    public void join() {
        System.out.println("玩家" + name + "加入了房间");
        count++;
    }
}
