public class Test03{
	public static void main(String[] args){
		Brand vivo = new Brand("Vivo", 1997);
		Lamp l1 = new Lamp(vivo, 120.0);
		System.out.println("这台价格为" + l1.getPrice() + "的台灯品牌为" + l1.getBrand().getName());
	}
}

class Lamp{	
// 台灯类
	
	// 品牌
	private Brand brand;

	// 价格
	private double price;

	// 无参构造方法
	public Lamp(){}

	// 全参构造方法
	public Lamp(Brand brand, double price){
		this.brand = brand;
		this.price = price;
	}// Lamp()

	// get方法
	public Brand getBrand(){
		return brand;
	}// getBrand()

	public double getPrice(){
		return price;
	}// getPrice()

	// set方法
	public void setBrand(Brand brand){
		this.brand = brand;
	}// setBrand()

	public void setPrice(double price){
		this.price = price;
	}// setPrice()
	
}

class Brand{
// 品牌类

	// 品牌名
	private String name;

	// 成立年份
	private int year;

	// 无参构造方法
	public Brand(){}

	// 有参构造方法
	public Brand(String name, int year){
		this.name = name;
		this.year = year;
	}// Brand()

	// get方法
	public String getName(){
		return name;
	}// getName()

	public int getYear(){
		return year;
	}// gerYear()

	// set方法
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setYear(int year){
		this.year = year;
	}// setYear()
}