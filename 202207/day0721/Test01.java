public class Test01{
	public static void main(String[] args){
		Student zhangSan = new Student(10182733, "张三");
		System.out.println(zhangSan.getStuNo());
		zhangSan.setStuNo(10182712);
		System.out.println(zhangSan.getStuNo());
	}
}

class Student
{
	// 学号
	private int stuNo;

	// 姓名
	private String name;

	// 无属性构造器
	public Student(){}

	// 全属性构造器
	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
	}

	// get方法
	public int getStuNo(){
		return this.stuNo;
	}// getStuNo()

	public String getName(){
		return this.name;
	}// getName()

	// set方法
	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}