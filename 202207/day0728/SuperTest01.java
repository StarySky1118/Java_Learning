public class SuperTest01{
	public static void main(String[] args){
		Vip v = new Vip("����");
		v.shopping();
	}
}

class Customer{
	String name;

	public Customer(){

	}

	public Customer(String name){
		this.name = name;
	}
}

class Vip extends Customer{
	public Vip(){

	}

	public Vip(String name){
		super(name);
	}

	public void shopping(){
		System.out.println(super.name + "���ڹ���");
	}
}