// 演示方法重载机制

public class OverloadTest01
{
	public static void main(String[] args)
	{
		System.out.println(bigger(100, 200));
		System.out.println(bigger(100, 200, 300));
		System.out.println(bigger(100.0, 200.0));
	}

	// 以下两个方法形参的个数不同，构成重载
	public static int bigger(int a, int b)
	{// 返回a和b中较大者
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c)
	{// 返回三者中较大者
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()

	// 下面的方法和上面的方法形参类型不同，构成重载
	public static double bigger(double a, double b)
	{
		return a > b ? a : b;
	}// bigger()
}