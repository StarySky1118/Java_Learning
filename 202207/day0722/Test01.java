public class Test01{
	public static void main(String[] args){
		Student wyq = new Student(2712, "王钰琪");
		System.out.println(wyq.getName());
		wyq.setName("JP果丁");
		System.out.println(wyq.getName());
	}
}

class Student{
// 学生类
	// 学号
	private int stuNo;

	// 姓名
	private String name;

	// 无参构造方法
	public Student(){}

	// 全参构造方法
	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
	}// Student

	// get方法
	public int getStuNo(){
		return stuNo;
	}// getStuNo

	public String getName(){
		return name;
	}// getName()

	// set方法
	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}