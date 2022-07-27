public class StaticTest01{
	public static void main(String[] args){
		Student s1 = new Student("田所浩二", 24);
		System.out.println(s1.getName() + "，" + s1.getStuNo() + "岁，事" + Student.occupation);
		System.out.println(s1.occupation);
	}
}

class Student{
// 学生类
	// 职业
	static String occupation = "学生";

	// 姓名
	private String name;

	// 学号
	private int stuNo;

	// 无参构造方法
	public Student(){}

	// 有参构造方法
	public Student(String name, int stuNo){
		this.name = name;
		this.stuNo = stuNo;
	}// Student()

	// get方法
	public String getName(){
		return name;
	}// getName()

	public int getStuNo(){
		return stuNo;
	}// getStuNo()

	// set方法
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()
}