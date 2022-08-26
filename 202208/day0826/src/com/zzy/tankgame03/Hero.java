package com.zzy.tankgame03;

import java.util.ArrayList;
import java.util.List;

// 己方坦克
public class Hero extends Tank{

    // 坦克发出的全部子弹
    private List<Bullet> bullets = new ArrayList<>();

    public Hero(int x, int y, int direction) {
        super(x, y, direction);
    }

    public List<Bullet> getBullets() {
        return bullets;
    }

    public void setBullets(List<Bullet> bullets) {
        this.bullets = bullets;
    }

    // 发射子弹
    /*
        创建一个BulletFly线程
    */
    public void shoot() {
        // 新建子弹，这颗子弹就是线程中那颗
        Bullet bullet = null;
        switch (getDirection()) {
            case 0 :
                bullet = new Bullet(getX() + 20, getY() ,0);
                break;
            case 1 :
                bullet = new Bullet(getX() + 60, getY() + 20, 1);
                break;
            case 2 :
                bullet = new Bullet(getX() + 20, getY() + 30, 2);
                break;
            case 3 :
                bullet = new Bullet(getX(), getY() + 20, 3);
                break;
        }
        bullets.add(bullet);

        // 创建BulletFly线程并启动
        Thread BulletFlyThread = new Thread(new BulletFly(bullet));
        BulletFlyThread.start();
    }
}
