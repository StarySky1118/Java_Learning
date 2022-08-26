package com.zzy.tankgame03;

// 子弹类
public class Bullet {
    private int x; // 子弹横坐标
    private int y; // 子弹纵坐标
    private int direction; // 子弹方向
    private int speed; // 子弹速度
    private final static int DEFAULT_BULLET_SPEED = 10; // 默认子弹速度
    private boolean state; // 是否存活

    // 构造器
    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = DEFAULT_BULLET_SPEED;
        this.state = true;

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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // 根据方向移动
    public void move() {
        switch (direction) {
            case 0 :
                y -= speed;
                break;
            case 1 :
                x += speed;
                break;
            case 2 :
                y += speed;
                break;
            case 3 :
                x -= speed;
                break;
        }
    }

    // 判断子弹是否存活
    public boolean isAlive() {
        // 不在窗口内
        if(!(x > 0 && x < 1000 && y > 0 && y < 1000)) {
            state = false;
            return false;
        }

        return true;
    }
}
