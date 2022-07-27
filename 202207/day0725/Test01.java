public class Test01{
	public static void main(String[] args){
		Address bjcy = new Address("北京", "朝阳");
		Student wyq = new Student("王钰琪", bjcy);
		System.out.println(wyq.getName() + "事" + wyq.getAddr().getCity() + wyq.getAddr().getStreet() + "人");
	}
}

class Student{
// 学生类
	// 职业
	public static occupation = "事学生";
	
	// 姓名
	private String name;

	// 地址
	private Address addr;

	// 无参构造方法
	public Student(){}

	// 有参构造方法
	public Student(String name, Address addr){
		this.name = name;
		this.addr = addr;
	}// Student()

	// get方法
	public String getName(){
		return name;
	}// getName()

	public Address getAddr(){
		return addr;
	}// getAddr()

	// set方法
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setAddr(Address addr){
		this.addr = addr;
	}// setAddr()

}// Student

class Address{
// 地址类
	// 城市
	private String city;

	// 街道
	private String street;

	// 无参构造器
	public Address(){}

	// 有参构造器
	public Address(String city, String street){
		this.city = city;
		this.street = street;
	}// Address()

	// get方法
	public String getCity(){
		return city;
	}// getCity()

	public String getStreet(){
		return street;
	}// getStreet()

	// set方法
	public void setCity(String city){
		this.city = city;
	}// setCity()

	public void setStreet(String street){
		this.street = street;
	}// setStreet()

}// Address	