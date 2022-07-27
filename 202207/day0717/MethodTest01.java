public class MethodTest01{
	public static void main(String[] args){
		System.out.println(sum(10, 20));
		System.out.println(sum(10.0, 20.0));
	}
	
	public static int sum(int a, int b){
		System.out.println("sumInt÷¥––£°");
		return a + b;
	}

	public static double sum(double a, double b){
		System.out.println("sumDouble÷¥––£°");
		return a + b;
	}
}