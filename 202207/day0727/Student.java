// ѧ����
public class Student{
	// ѧ��
	private String no;

	// ����
	private String name;

	// �޲ι��췽��
	public Student(){

	}// Student()

	// �вι��췽��
	public Student(String no, String name){
		this.no = no;
		this.name = name;
	}// Student()

	// setter and getter
	public void setNo(String no){
		this.no = no;
	}// setNo()

	public String getNo(){
		return no;
	}// getNo()

	public void setName(String name){
		this.name = name;
	}// setName()

	public String getName(){
		return name;
	}// getName()
}