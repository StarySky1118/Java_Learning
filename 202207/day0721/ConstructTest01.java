public class ConstructTest01{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(10182733, "������");
		System.out.println(s2.name);
	}
}

class Student{

	int stuNo; // ѧ��
	String name; // ����

	// �޲������췽��
	public Student(){
		System.out.println("�޲ι��췽��ִ�У�");
	}// Student

	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
		System.out.println("�вι��췽��ִ�У�");
	}// Student
}