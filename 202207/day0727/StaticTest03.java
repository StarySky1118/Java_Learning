/*
	��ʾthis��ʹ�á�
*/
public class StaticTest03{
	public static void main(String[] args){
		Student wyq = new Student();
		System.out.println(wyq.getName());
	}
}

class Student{
// ѧ����
	// ѧ��
	private int no;

	// ����
	private String name;

	// �޲ι���
	public Student(){
		this(10182712, "������");
	}

	// �вι���
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