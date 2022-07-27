/*
	演示实例代码块的使用。实例代码块在创建对象时执行。
*/
public class StaticTest02{
	public static void main(String[] args){
		Student s1 = new Student();
	}
}

class Student{
	{
		System.out.println("对象创建！");
	}
	
	// 学号
	int no;

	// 姓名
	String name;
}