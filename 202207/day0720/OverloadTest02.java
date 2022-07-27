// 演示方法重载机制
public class OverloadTest02{
	public static void main(String[] args){
		m1("虎哥", "就是歌姬");
		m1("虎哥", "就是歌姬", "吧");
		m1("虎哥", 250);
		m1(250, "虎哥");
	}

	// 以下两个方法形参个数不同，构成重载
	public static void m1(String a, String b){
		System.out.println(a + b);
	}// m1()

	public static void m1(String a, String b, String c){
		System.out.println(a + b + c);
	}// m1()

	// 以下方法形参种类和上述方法不同，构成重载
	public static void m1(String a, int b){
		System.out.println(a + b);
	}// m1()

	// 以下方法形参顺序和上述方法不同，构成重载
	public static void m1(int a, String b){
		System.out.println(b + a);
	}// m1()

}