public class Test02{
	public static void main(String[] args){
		User u1 = new User(2712, "������");
		System.out.println(u1.getName());
		u1.setName("wyq");
		System.out.println(u1.getName());
	}
}

class User{
	// �û���
	
	// �û����
	int userNo;

	// �û�����
	String name;

	// �޲������췽��
	public User(){}

	// ȫ�������췽��
	public User(int userNo, String name){
		this.userNo = userNo;
		this.name = name;
	}// User()

	// get����
	public int getUserNo(){
		return this.userNo;
	}// getUserNo()

	public String getName(){
		return this.name;
	}// gerName()

	// set����
	public void setUserNo(int userNo){
		this.userNo = userNo; 
	}// setUserNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}