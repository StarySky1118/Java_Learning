// 本科生类
public class Bachelor extends Student{
	// 年级
	private int grade;

	// 无参构造方法
	public Bachelor(){

	}// Bachelor()

	// 有参构造方法
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