// 演示方法重载机制
public class MethodTest03{
	public static void main(String[] args){
		System.out.println(sum(1, 1, 1));
		System.out.println(sum(1, 1));
		define("虎哥");
		define(122);
		System.out.println(sum(100, 3.14));
		System.out.println(sum(3.14, 100));
	}

	// 以下方法形参个数不同，构成重载
	public static int sum(int a, int b, int c){
	// 计算三个整型数据的和
		return a + b + c;
	}// sum

	public static int sum(int a, int b){
	// 计算两个整形数据的和
		return a + b;
	}// sum

	// 以下两个方法形参的类型不同，构成重载
	public static void define(String name){
		System.out.println(name);
	}// define

	public static void define(int a){
		System.out.println(a);
	}// define

	// 以下两个方法形参的顺序不同，也构成重载
	public static double sum(double a, int b){
		return a + b;
	}// sum

	public static double sum(int a, double b){
		return a + b;
	}// sum

}