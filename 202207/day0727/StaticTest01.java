/*
	演示静态代码块的使用。
*/
public class StaticTest01{
	static {
		System.out.println("类加载！");
	}

	public static void main(String[] args){
		System.out.println("main Begin");
	}

	static {
		System.out.println("类加载2！");
	}
}