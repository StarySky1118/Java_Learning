public class ConstructTest02{
	public static void main(String[] args){
		User u1 = new User();
		User u2 = new User(10182733, "张子亿", 22);
		System.out.println(u2.name);
	}
}

class User
{
	// 编号
	int userNo;

	// 姓名
	String name;

	// 年龄
	int age;

	// 无参数构造方法
	public User(){
	}// User()

	// 全参数构造方法
	public User(int userNo, String name, int age){
		this.userNo = userNo;
		this.name = name;
		this.age = age;
	}// User()
}