public class Test03{
	public static void main(String[] args){
		Brand vivo = new Brand("Vivo", 1997);
		Lamp l1 = new Lamp(vivo, 120.0);
		System.out.println("��̨�۸�Ϊ" + l1.getPrice() + "��̨��Ʒ��Ϊ" + l1.getBrand().getName());
	}
}

class Lamp{	
// ̨����
	
	// Ʒ��
	private Brand brand;

	// �۸�
	private double price;

	// �޲ι��췽��
	public Lamp(){}

	// ȫ�ι��췽��
	public Lamp(Brand brand, double price){
		this.brand = brand;
		this.price = price;
	}// Lamp()

	// get����
	public Brand getBrand(){
		return brand;
	}// getBrand()

	public double getPrice(){
		return price;
	}// getPrice()

	// set����
	public void setBrand(Brand brand){
		this.brand = brand;
	}// setBrand()

	public void setPrice(double price){
		this.price = price;
	}// setPrice()
	
}

class Brand{
// Ʒ����

	// Ʒ����
	private String name;

	// �������
	private int year;

	// �޲ι��췽��
	public Brand(){}

	// �вι��췽��
	public Brand(String name, int year){
		this.name = name;
		this.year = year;
	}// Brand()

	// get����
	public String getName(){
		return name;
	}// getName()

	public int getYear(){
		return year;
	}// gerYear()

	// set����
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setYear(int year){
		this.year = year;
	}// setYear()
}