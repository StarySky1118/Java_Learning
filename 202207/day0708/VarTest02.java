public class VarTest02{
	// 声明成员变量
	int i = 300; // 次成员变量的作用域是VarTest02类
	
	public static void main(String[] args)
	{
		int i = 100; // 此局部变量i的作用域是main方法
	}

	public static void doSome()
	{
		int i = 200; // 此局部变量i的作用域是doSome方法
	}
}