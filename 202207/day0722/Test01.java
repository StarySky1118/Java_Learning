public class Test01{
	public static void main(String[] args){
		Student wyq = new Student(2712, "������");
		System.out.println(wyq.getName());
		wyq.setName("JP����");
		System.out.println(wyq.getName());
	}
}

class Student{
// ѧ����
	// ѧ��
	private int stuNo;

	// ����
	private String name;

	// �޲ι��췽��
	public Student(){}

	// ȫ�ι��췽��
	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
	}// Student

	// get����
	public int getStuNo(){
		return stuNo;
	}// getStuNo

	public String getName(){
		return name;
	}// getName()

	// set����
	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}