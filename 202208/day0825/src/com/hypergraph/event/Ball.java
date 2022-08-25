package com.hypergraph.event;

// 小球
public class Ball {
    private int x; // 横坐标
    private int y; // 纵坐标

    // 构造器
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter and setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
