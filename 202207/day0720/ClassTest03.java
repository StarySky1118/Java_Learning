public class ClassTest03
{
	public static void main(String[] args)
	{
		Address a = new Address();
		a.city = "�Ϻ�";
		a.street = "÷¤·";
		a.zipcode = "271113";
		
		Student zhangsan = new Student();

		zhangsan.name = "������";
		zhangsan.stu_No = "10182733";
		zhangsan.addr = a;

		System.out.println(zhangsan.name + "��ס�ĳ�����" + zhangsan.addr.city);
	}
}

class Address
{// ��ַ��
	String city;
	String street;
	String zipcode;
}// Address

class Student
{// ѧ����
	String name;
	String stu_No;
	Address addr;
}// Student