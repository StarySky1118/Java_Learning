// 静态方法和实例方法的区别

public class Test02{
	public static void main(String[] args){
		// 调用静态方法
		System.out.println(addString("虎哥", "没活了"));

		// 调用实例方法
		Test02 t = new Test02();
		System.out.println(t.addString2("虎哥", "没活了"));
	}// main()

	// 静态方法
	public static String addString(String a, String b){
		return a + b;
	}// addString()

	// 实例方法
	public String addString2(String a, String b){
		return a + b;
	}// addString2()
}