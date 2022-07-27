public class ClassTest03
{
	public static void main(String[] args)
	{
		Address a = new Address();
		a.city = "上海";
		a.street = "梅陇路";
		a.zipcode = "271113";
		
		Student zhangsan = new Student();

		zhangsan.name = "张子亿";
		zhangsan.stu_No = "10182733";
		zhangsan.addr = a;

		System.out.println(zhangsan.name + "居住的城市是" + zhangsan.addr.city);
	}
}

class Address
{// 地址类
	String city;
	String street;
	String zipcode;
}// Address

class Student
{// 学生类
	String name;
	String stu_No;
	Address addr;
}// Student