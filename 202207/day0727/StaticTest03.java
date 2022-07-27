/*
	演示this的使用。
*/
public class StaticTest03{
	public static void main(String[] args){
		Student wyq = new Student();
		System.out.println(wyq.getName());
	}
}

class Student{
// 学生类
	// 学号
	private int no;

	// 姓名
	private String name;

	// 无参构造
	public Student(){
		this(10182712, "王钰琪");
	}

	// 有参构造
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}// Student

	// setter and getter
	public void setNo(int no){
		this.no = no;
	}// setNo()

	public int getNo(){
		return no;
	}// getNo()

	public void setName(String name){
		this.name = name;
	}// setName()

	public String getName(){
		return name;
	}// getName()
}// Student