// 演示方法重载机制

public class MethodTest04{
	public static void main(String[] args){
		merge("我是", "虎哥");
		merge("我就是", "歌姬", "吧");
		merge("虎哥", 250);
		merge(250, "虎哥");
	}// main()

	// 以下两个方法形参个数不同，构成重载
	public static void merge(String a, String b){
	// 实现两个字符串的拼接输出
		System.out.println(a + b);
	}// merge()

	public static void merge(String a, String b, String c){
	// 实现三个字符串的拼接输出
		System.out.println(a + b + c);
	}// merge()

	// 以下两个方法形参类型不同，也构成重载
	public static void merge(String a, int b){
		System.out.println(a + b);
	}// merge()

	public static void merge(int a, String b){
		System.out.println(a + b);
	}// merge()
}