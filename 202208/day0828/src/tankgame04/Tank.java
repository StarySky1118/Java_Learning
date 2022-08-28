package tankgame04;

import java.util.List;
import java.util.Vector;

// 坦克类
public class Tank {
    private int x; // 横坐标
    private int y; // 纵坐标

    private int direction; // 方向

    private int speed; // 移动速度
    private int health; // 坦克生命值

    // 坦克发出的全部子弹
    private List<Bullet> bullets = new Vector<>();

    // 构造器
    public Tank(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = 4; // 默认速度为4
        this.health = 2; // 默认生命值为2
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Bullet> getBullets() {
        return bullets;
    }

    public void setBullets(List<Bullet> bullets) {
        this.bullets = bullets;
    }

    // 上下左右移动方法
    public void moveUp() {
        if (y > speed) {
            y -= speed;
        }
    }

    public void moveDown() {
        if (y + speed + 60< MyFrame.DEFAULT_HEIGHT) {
            y += speed;
        }
    }

    public void moveLeft() {
        if (x - speed > 0) {
            x -= speed;
        }
    }

    public void moveRight() {
        if (x + speed + 60< MyFrame.DEFAULT_WIDTH) {
            x += speed;
        }
    }

    // 被击中
    public void isHit() {
        health--;
    }

    // 发射子弹
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

//    // 坦克是否越界
//    private boolean isOutOfBound() {
////        boolean flag = false;
////        switch (direction) {
////            case 0 :
////            case 2 :
////                if(!(x > 0 && x < MyFrame.DEFAULT_WIDTH - 40 && y > 0 && y < MyFrame.DEFAULT_HEIGHT - 60)) {
////                    flag = true;
////                }
////                break;
////            case 1 :
////            case 3 :
////                if(!(x > 0 && x < MyFrame.DEFAULT_WIDTH - 60 && y > 0 && y < MyFrame.DEFAULT_HEIGHT - 40)) {
////                    flag = true;
////                }
////                break;
////        }
//        if (!(x > 4 && x < MyFrame.DEFAULT_WIDTH - 60 && y > 0 && y < MyFrame.DEFAULT_HEIGHT - 60)) {
//            return true;
//        }
//        return false;
//    }
}
