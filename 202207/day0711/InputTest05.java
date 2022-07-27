public class InputTest05{
	public static void main(String[] args)
	{
		// 创建一个扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入数据
		System.out.println("请输入一个整数：");
		int userInputNum = s.nextInt();
		System.out.println("您输入的整数为：" + userInputNum);
	}
}