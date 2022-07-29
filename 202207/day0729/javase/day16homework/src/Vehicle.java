// 交通工具类
public class Vehicle {
    // 速度
    private double speed;

    // 体积
    private double size;

    // 无参构造方法
    public Vehicle() {
    }

    // 有参构造方法
    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    // setter and getter
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    // 移动
    public void move(){
        System.out.println("汽车开始移动！");
    }

    // 加速
    public void speedUp(){
        speed++;
    }

    // 减速
    public void speedDown(){
        if(speed>0) {
            speed--;
        }
    }
}
