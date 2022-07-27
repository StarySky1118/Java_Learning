public class ClassTest04{
	public static void main(String[] args){
		Girl wangYuQi = new Girl();
		Girl wangYaoYao = new Girl();
		Girl Emily = new Girl();
		System.out.println("对象已创建完成！");
	}
}

class Girl
{
	// 罩杯
	String cup;

	// 颜值
	int face;

	// 臀围
	int ass;
}