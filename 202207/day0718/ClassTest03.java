public class ClassTest03{
	public static void main(String[] args){
		Computer dell_g3 = new Computer();
		Computer dell_g15 = new Computer();
		Computer acer_a3 = new Computer();
		System.out.println("对象已创建完成！");
	}
}
class Computer
{
	// 品牌
	String brand;

	// CPU
	String cpu_Name;

	// GPU
	String gpu_Name;
}