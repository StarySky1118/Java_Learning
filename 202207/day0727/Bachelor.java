// ��������
public class Bachelor extends Student{
	// �꼶
	private int grade;

	// �޲ι��췽��
	public Bachelor(){

	}// Bachelor()

	// �вι��췽��
	public Bachelor(String no, String name, int grade){
		setNo(no);
		setName(name);
		this.grade = grade;
	}// Bachelor()

	// setter and getter
	public void setGrade(int grade){
		this.grade = grade;
	}// setGrade()

	public int getGrade(){
		return grade;
	}// getGrade()
}// Bachelor