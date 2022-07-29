// 我的时间类
public class MyTime {
    // 时
    private int hour;

    // 分
    private int minute;

    // 秒
    private int second;

    // 无参构造方法
    public MyTime() {
    }

    // 有参构造方法
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // setter and getter
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // 展示时间
    public void display(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
