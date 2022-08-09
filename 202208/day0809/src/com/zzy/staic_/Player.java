package com.zzy.staic_;

// 玩家类
public class Player {
    public static int totalNum = 0; // 总玩家人数

    private String name; // 玩家昵称
    private String uid; // 玩家ID

    // 构造器
    public Player() {
    }

    public Player(String name, String uid) {
        this.name = name;
        this.uid = uid;
    }

    // setter and getter
    public static int getTotalNum() {
        return totalNum;
    }

    public static void setTotalNum(int totalNum) {
        Player.totalNum = totalNum;
    }

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

    // 加入游戏
    public void join() {
        System.out.println("玩家" + name + "加入了房间");
        totalNum++;
    }

    // 退出游戏
    public void quit() {
        System.out.println("玩家" + name + "退出了房间");
        totalNum--;
    }

}
