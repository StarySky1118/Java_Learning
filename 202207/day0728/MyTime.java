// 我的时间类
public class MyTime{
	// 时
	private int hour;
	
	// 分
	private int minute;

	// 无参构造方法
	public MyTime(){
		this(21, 50);
	}

	// 有参构造方法
	public MyTime(int hour, int minute){
		this.hour = hour;
		this.minute = minute;
	}

	// setter and getter
	public void setHour(int hour){
		this.hour = hour;
	}

	public int getHour(){
		return hour;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public int getMinute(){
		return minute;
	}

	// 重写toString()方法
	public String toString(){
		return hour + ":" + minute;
	}
}