// 学生类
public class Student{
	// 学号
	private String no;

	// 姓名
	private String name;

	// 无参构造方法
	public Student(){

	}// Student()

	// 有参构造方法
	public Student(String no, String name){
		this.no = no;
		this.name = name;
	}// Student()

	// setter and getter
	public void setNo(String no){
		this.no = no;
	}// setNo()

	public String getNo(){
		return no;
	}// getNo()

	public void setName(String name){
		this.name = name;
	}// setName()

	public String getName(){
		return name;
	}// getName()
}