public class OverloadTest02{
	public static void main(String[] args){
		System.out.println(bigger(10, 20));
		System.out.println(bigger(10, 20, 30));
	}// main()

	public static int bigger(int a, int b){
	// 返回整型数据a,b中较大者
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c){
	// 返回三个整型数据a, b, c中较大者
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()
}