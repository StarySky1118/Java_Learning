// �ҵ�ʱ����
public class MyTime{
	// ʱ
	private int hour;
	
	// ��
	private int minute;

	// �޲ι��췽��
	public MyTime(){
		this(21, 50);
	}

	// �вι��췽��
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

	// ��дtoString()����
	public String toString(){
		return hour + ":" + minute;
	}
}