package drawcircle;

// 小球
public class Ball {
    private int x; // 横坐标
    private int y; // 纵坐标
    private int speed; // 速度
    public static final int DEFAULT_BALL_SPEED = 4; // 默认速度

    // 构造器
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        speed = DEFAULT_BALL_SPEED;
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

    // 移动
    public void move(int direction) {
        // 根据方向移动
        switch (direction) {
            case 0 : // 向上移动
                y -= speed;
                break;
            case 1 : // 向右移动
                x += speed;
                break;
            case 2 : // 向下移动
                y += speed;
                break;
            case 3 :
                x -= speed;
                break;
        }
    }
}
