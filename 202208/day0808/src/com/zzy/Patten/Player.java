package com.zzy.Patten;

// 球员类
public class Player {
    private String name; // 姓名
    private String team; // 队名
    // 在类的内部创建对象
    private final static Player player = new Player("勒布朗·詹姆斯", "洛杉矶湖人");

    // 构造器私有化
    private Player(String name, String team) {
        this.name = name;
        this.team = team;
    }

    // 获取对象方法
    public static Player getInstance() {
        return player;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
