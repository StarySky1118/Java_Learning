package tankgame04;

// 爆炸类
public class Boom {
    private int x; // 爆炸横坐标
    private int y; // 爆炸纵坐标
    private int lifeCycle = 3; // 声明周期

    // 构造器
    public Boom(int x, int y) {
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

    public int getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(int lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    // 生命周期缩短
    public void lifeDown() {
        if(lifeCycle > 0) {
            lifeCycle--;
        }
    }
}
