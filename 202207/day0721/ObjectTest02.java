public class ObjectTest02{
	public static void main(String[] args){
		// 创建品牌对象
		Brand iqoo = new Brand();
		iqoo.name = "IQOO";
		iqoo.slogan = "技术宅改变世界";

		// 创建芯片对象
		Soc snapdragon865 = new Soc();
		snapdragon865.name = "骁龙865";
		snapdragon865.f = 2.4;
		
		// 创建手机对象
		Phone iqooNeo3 = new Phone();
		iqooNeo3.brand = iqoo;
		iqooNeo3.soc = snapdragon865;

		// 返回手机品牌标语
		System.out.println(iqooNeo3.brand.name + "，" + iqooNeo3.brand.slogan);
	}
}

class Phone{
// 手机类
	Brand brand; // 品牌
	Soc soc; // 芯片
}// Phone

class Brand{
// 品牌类
	String name; // 品牌名
	String slogan; // 标语
}// Brand

class Soc{
// 芯片类
	String name; // 芯片名
	double f; // 时钟频率
}// Soc