public class Test01{
	public static void main(String[] args){
		Address bjcy = new Address("����", "����");
		Student wyq = new Student("������", bjcy);
		System.out.println(wyq.getName() + "��" + wyq.getAddr().getCity() + wyq.getAddr().getStreet() + "��");
	}
}

class Student{
// ѧ����
	// ְҵ
	public static occupation = "��ѧ��";
	
	// ����
	private String name;

	// ��ַ
	private Address addr;

	// �޲ι��췽��
	public Student(){}

	// �вι��췽��
	public Student(String name, Address addr){
		this.name = name;
		this.addr = addr;
	}// Student()

	// get����
	public String getName(){
		return name;
	}// getName()

	public Address getAddr(){
		return addr;
	}// getAddr()

	// set����
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setAddr(Address addr){
		this.addr = addr;
	}// setAddr()

}// Student

class Address{
// ��ַ��
	// ����
	private String city;

	// �ֵ�
	private String street;

	// �޲ι�����
	public Address(){}

	// �вι�����
	public Address(String city, String street){
		this.city = city;
		this.street = street;
	}// Address()

	// get����
	public String getCity(){
		return city;
	}// getCity()

	public String getStreet(){
		return street;
	}// getStreet()

	// set����
	public void setCity(String city){
		this.city = city;
	}// setCity()

	public void setStreet(String street){
		this.street = street;
	}// setStreet()

}// Address	