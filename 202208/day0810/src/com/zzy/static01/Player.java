package com.zzy.static01;

// 玩家类
public class Player {
    private String name; // 玩家昵称
    private String uid; // 玩家ID
    private static int playerNum = 0; // 当前房间的人数

    // 构造器
    public Player() {
    }

    public Player(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public static int getPlayerNum() {
        return playerNum;
    }

    // 玩家加入房间
    public void join() {
        System.out.println("玩家" + name + "加入房间...");
        playerNum++;
        System.out.println("当前房间人数: " + playerNum);
    }

    // 玩家退出房间
    public void quit() {
        System.out.println("玩家" + name + "退出房间...");
        playerNum++;
        System.out.println("当前房间人数: " + playerNum);
    }
}
