public class InputTest01{
	public static void main(String[] args)
	{
		// 创建一个用户扫描器对象
		java.util.Scanner s  = new java.util.Scanner(System.in);

		// 从键盘上接收一个int
		System.out.println("请输入一个整数:");
		int i = s.nextInt();

		System.out.println("您输入的整数为：" + i);
	}
}