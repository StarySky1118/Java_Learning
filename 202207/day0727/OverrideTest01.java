public class OverrideTest01{
	public static void main(String[] args){
		Animal a = new Animal();
		a.move();

		Human h = new Human();
		h.move();
	}
}

class Animal{
	public void move(){
		System.out.println("���涯�������");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("����homo�����");
	}
}