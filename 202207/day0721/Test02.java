public class Test02{
	public static void main(String[] args){
		User u1 = new User(2712, "王钰琪");
		System.out.println(u1.getName());
		u1.setName("wyq");
		System.out.println(u1.getName());
	}
}

class User{
	// 用户类
	
	// 用户编号
	int userNo;

	// 用户姓名
	String name;

	// 无参数构造方法
	public User(){}

	// 全参数构造方法
	public User(int userNo, String name){
		this.userNo = userNo;
		this.name = name;
	}// User()

	// get方法
	public int getUserNo(){
		return this.userNo;
	}// getUserNo()

	public String getName(){
		return this.name;
	}// gerName()

	// set方法
	public void setUserNo(int userNo){
		this.userNo = userNo; 
	}// setUserNo()

	public void setName(String name){
		this.name = name;
	}// setName()
}