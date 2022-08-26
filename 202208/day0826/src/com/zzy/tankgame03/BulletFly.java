package com.zzy.tankgame03;

public class BulletFly implements Runnable{
    private Bullet bullet;

    public BulletFly(Bullet bullet) {
        this.bullet = bullet;
    }

    // 子弹飞行
    @Override
    public void run() {
        while(true) {
            // 子弹移动
            bullet.move();

            // 子弹休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("子弹坐标：x = " + bullet.getX() + "y = " + bullet.getY());

            // 判断是否存活
            if(!(bullet.isAlive())) {
                break;
            }
        }
    }
}
