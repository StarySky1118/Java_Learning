// 演示方法重载机制
public class OverloadTest03{
	public static void main(String[] args){
		System.out.println(bigger(10, 20));
		System.out.println(bigger(10, 20, 30));
		System.out.println(bigger(10.0, 20.0));
	}// main()

	// 形参个数不同构成重载
	public static int bigger(int a, int b){
	// 返回a,b中较大者
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c){
	// 返回a, b, c中较大者
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()

	// 形参类型不同构成重载
	public static double bigger(double a, double b){
		return a > b ? a : b;
	}// bigger()


}