public class ThisTest01{
	public static void main(String[] args){
		Student wyq = new Student();
		System.out.println(wyq.getName());
	}
}

class Student{
// 学生类
	// 姓名
	private String name;

	// 年龄
	private int age;

	// 无参构造方法
	public Student(){
		this("王钰琪", 22);
	}// Student()

	// 有参构造方法
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}// Student()

	// setter and getter
	public void setName(String name){
		this.name = name;
	}// setName()

	public String getName(){
		return name;
	}// getName()

	public void setAge(int age){
		this.age = age;
	}// setAge()

	public int getAge(){
		return age;
	}

}