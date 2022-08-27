package tankgame04;

// 子弹类
public class Bullet {
    private int x; // 子弹横坐标
    private int y; // 子弹纵坐标
    private int direction; // 子弹方向
    private int speed; // 子弹速度
    private final static int DEFAULT_BULLET_SPEED = 10; // 默认子弹速度
    private boolean alive; // 是否存活

    // 构造器
    public Bullet(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = DEFAULT_BULLET_SPEED;
        this.alive = true;

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

    public void setAlive(boolean alive) {
        this.alive = alive;
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
        // 仍存活时判断是否在窗口内
        if(alive) {
            if(!(x > 0 && x < 1000 && y > 0 && y < 1000)) {
                alive = false;
            }
        }

        return alive;
    }

    // 判断子弹是否击中坦克
    public void hitTank(Tank tank) {
        switch (tank.getDirection()) {
            case 0 : // 坦克向上
            case 2 : // 坦克向下
                if(x > tank.getX() && x < tank.getX() + 40 && y > tank.getY() && y < tank.getY() + 60) {
                    this.alive = false; // 子弹消失
                    tank.isHit(); // 坦克被击中
                }
                break;
            case 1 : // 坦克向右
            case 3 : // 坦克向左
                if(x > tank.getX() && x < tank.getX() + 60 && y > tank.getY() && y < tank.getY() + 40) {
                    this.alive = false;
                    tank.isHit();
                }
        }
    }
}
