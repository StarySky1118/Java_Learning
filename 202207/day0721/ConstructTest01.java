public class ConstructTest01{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(10182733, "张子亿");
		System.out.println(s2.name);
	}
}

class Student{

	int stuNo; // 学号
	String name; // 姓名

	// 无参数构造方法
	public Student(){
		System.out.println("无参构造方法执行！");
	}// Student

	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
		System.out.println("有参构造方法执行！");
	}// Student
}