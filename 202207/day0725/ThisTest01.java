public class ThisTest01{
	public static void main(String[] args){
		Student wyq = new Student();
		System.out.println(wyq.getName());
	}
}

class Student{
// ѧ����
	// ����
	private String name;

	// ����
	private int age;

	// �޲ι��췽��
	public Student(){
		this("������", 22);
	}// Student()

	// �вι��췽��
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