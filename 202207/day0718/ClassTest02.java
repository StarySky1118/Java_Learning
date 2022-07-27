// 练习对象创建的语法
public class ClassTest02{
	public static void main(String[] args){
		AC midea_a1 = new AC();
		AC geli_a1 = new AC();
		System.out.println("对象已经创建完成！");
	}

}

class AC
{
	// 品牌
	String brand;

	// 功率
	int capacity;

	// 耗电等级
	int level;
}