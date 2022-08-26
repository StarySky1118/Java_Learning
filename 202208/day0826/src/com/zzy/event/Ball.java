package com.zzy.event;

// 小球类
public class Ball {
    private int x; // 横坐标
    private int y; // 纵坐标

    private int speed; // 速度

    private final static int DEFAULT_SPEED = 4; // 默认速度

    // 构造器
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        speed = DEFAULT_SPEED;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // 上右下左移动方法
    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }
}
