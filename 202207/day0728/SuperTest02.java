public class SuperTest02{
	public static void main(String[] args){
		Cat c = new Cat();
		c.move();
	}
}

class Animal{
	public void move(){
		System.out.println("动物在移动！");
	}
}

class Cat extends Animal{
	public void move(){
		// System.out.println("猫走猫步");
		super.move();
	}
}