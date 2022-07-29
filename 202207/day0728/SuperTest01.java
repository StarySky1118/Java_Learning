public class SuperTest01{
	public static void main(String[] args){
		Vip v = new Vip("张三");
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
		System.out.println(super.name + "正在购物");
	}
}