public class ConstructTest02{
	public static void main(String[] args){
		User u1 = new User();
		User u2 = new User(10182733, "������", 22);
		System.out.println(u2.name);
	}
}

class User
{
	// ���
	int userNo;

	// ����
	String name;

	// ����
	int age;

	// �޲������췽��
	public User(){
	}// User()

	// ȫ�������췽��
	public User(int userNo, String name, int age){
		this.userNo = userNo;
		this.name = name;
		this.age = age;
	}// User()
}