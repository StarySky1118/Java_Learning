// 演示实例语句块的使用
public class InstanceTest01{
	{
		System.out.println("静态代码块执行！");
	}

	public static void main(String[] args){
		InstanceTest01 t = new InstanceTest01("虎哥");
	}
	
	// 无参构造方法
	public InstanceTest01(){}

	// 有参构造方法
	public InstanceTest01(String name){
		System.out.println(name);
	}
}