public class Test01{
	public static void main(String[] args){
		Student zhangSan = new Student(10182733, "����");
		System.out.println(zhangSan.getStuNo());
		zhangSan.setStuNo(10182712);
		System.out.println(zhangSan.getStuNo());
	}
}

class Student
{
	// ѧ��
	private int stuNo;

	// ����
	private String name;

	// �����Թ�����
	public Student(){}

	// ȫ���Թ�����
	public Student(int stuNo, String name){
		this.stuNo = stuNo;
		this.name = name;
	}

	// get����
	public int getStuNo(){
		return this.stuNo;
	}// getStuNo()

	public String getName(){
		return this.name;
	}// getName()

	// set����
	public void setStuNo(int stuNo){
		this.stuNo = stuNo;
	}// setStuNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}