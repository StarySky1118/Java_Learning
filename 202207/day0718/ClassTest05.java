public class ClassTest05{
	public static void main(String[] args){
		Chair c1 = new Chair();
		System.out.println("对象已创建成功！");
	}
}

class Chair
{
	// 品类
	int type;

	// 材料
	int material;

	// 价格
	int price;
}