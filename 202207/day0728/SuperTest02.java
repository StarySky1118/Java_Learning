public class SuperTest02{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
	}
}

class Animal{
	public void move(){
		System.out.println("�������ƶ���");
	}
}

class Cat extends Animal{
	public void move(){
		// System.out.println("è��è��");
		super.move();
	}
}