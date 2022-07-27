// 演示方法重载

public class OverloadTest01{

	public static void main(String[] args){
		System.out.println(bigger(100, 200));
		System.out.println(bigger(100, 200, 300));
	}// main()

	// 以下两种方法形参个数不同，构成重载
	public static int bigger(int a, int b){
	// 返回a和b中较大者
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c){
	// 返回a, b, c中较大者
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()

	// 以下方法和上面两种方法形参类型不同，也构成重载
	public static double bigger(double a, double b){
		return a > b ? a : b;
	}// bigger()

	// 仅仅是修饰符不同或返回值类型不同不构成重载
	/*
		public static void m1(){}
		void m1(){}
	*/

	/*
		public static int m2(){}
		public static double m2(){}
	*/
}