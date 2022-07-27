public class DateTest{
	public static void main(String[] args){
		Date d1 = new Date(1999, 12, 25);
		System.out.println("今天的日期是:" + d1.getYear() + "年" + d1.getMonth() + "月" + d1.getDay() + "日");
	}
}

class Date{
// 日期类
	// 年
	private int year;

	// 月
	private int month;

	// 日
	private int day;

	// 无参构造方法
	public Date(){}

	// 有参构造方法
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}// Date()

	// get方法
	public int getYear(){
		return year;
	}// getYear()

	public int getMonth(){
		return month;
	}// getMonth()

	public int getDay(){
		return day;
	}// getDay()

	// set方法
	public void setYear(int year){
		this.year = year;
	}// setYear()

	public void setMonth(int month){
		this.month = month;
	}// setMonth()

	public void setDay(int day){
		this.day = day;
	}// setDay()
}// Date