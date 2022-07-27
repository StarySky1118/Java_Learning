public class InputTest02{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入
		System.out.print("请输入您的姓名：");
		String name = s.next();
		System.out.println("请问您的名字是" + name + "吗？真是个傻逼的名字");
	}
}