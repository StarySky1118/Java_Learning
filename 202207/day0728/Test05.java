public class Test05{
	public static void main(String[] args){
		Pet xiaoHua = new Cat();
		Pet banDian = new Dog();
		Master zzy = new Master();

		zzy.feed(xiaoHua);
		zzy.feed(banDian);
		
	}
}