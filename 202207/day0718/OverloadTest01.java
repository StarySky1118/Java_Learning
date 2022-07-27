// 演示方法重载机制
public class OverloadTest01{
	public static void main(String[] args){
		m1();
		m1("虎哥就是歌姬吧!");
		m1(1);
		m1("虎哥", 250);
		m1(250, "虎哥");
	}

	// 形参个数不同构成重载
	public static void m1(){
		System.out.println("m1()");
	}// m1()

	public static void m1(String a){
		System.out.println(a);
	}// m1()

	// 形参类型不同构成重载
	public static void m1(int a){
		System.out.println(a);
	}// m1()

	// 形参顺序不同构成重载
	public static void m1(String a, int b){
		System.out.println(a + b);
	}// m1()

	public static void m1(int a, String b){
		System.out.println(a + b);
	}// m1()

	// 返回值不同不构成重载
	/*
		public static int m2(){}
		public static double m2(){}
	*/

	// 修饰符列表不同也不构成重载
	/*
		public static void m2(){}
		void m2(){}
	*/
}