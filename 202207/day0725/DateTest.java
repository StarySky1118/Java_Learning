public class DateTest{
	public static void main(String[] args){
		Date d1 = new Date(1999, 12, 25);
		System.out.println("�����������:" + d1.getYear() + "��" + d1.getMonth() + "��" + d1.getDay() + "��");
	}
}

class Date{
// ������
	// ��
	private int year;

	// ��
	private int month;

	// ��
	private int day;

	// �޲ι��췽��
	public Date(){}

	// �вι��췽��
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}// Date()

	// get����
	public int getYear(){
		return year;
	}// getYear()

	public int getMonth(){
		return month;
	}// getMonth()

	public int getDay(){
		return day;
	}// getDay()

	// set����
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