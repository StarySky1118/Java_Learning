public class StaticTest01{
	public static void main(String[] args){
		Student s1 = new Student("�����ƶ�", 24);
		System.out.println(s1.getName() + "��" + s1.getStuNo() + "�꣬��" + Student.occupation);
		System.out.println(s1.occupation);
	}
}

class Student{
// ѧ����
	// ְҵ
	static String occupation = "ѧ��";

	// ����
	private String name;

	// ѧ��
	private int stuNo;

	// �޲ι��췽��
	public Student(){}

	// �вι��췽��
	public Student(String name, int stuNo){
		this.name = name;
		this.stuNo = stuNo;
	}// Student()

	// get����
	public String getName(){
		return name;
	}// getName()

	public int getStuNo(){
		return stuNo;
	}// getStuNo()

	// set����
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()
}