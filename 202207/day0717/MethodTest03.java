// ��ʾ�������ػ���
public class MethodTest03{
	public static void main(String[] args){
		System.out.println(sum(1, 1, 1));
		System.out.println(sum(1, 1));
		define("����");
		define(122);
		System.out.println(sum(100, 3.14));
		System.out.println(sum(3.14, 100));
	}

	// ���·����βθ�����ͬ����������
	public static int sum(int a, int b, int c){
	// ���������������ݵĺ�
		return a + b + c;
	}// sum

	public static int sum(int a, int b){
	// ���������������ݵĺ�
		return a + b;
	}// sum

	// �������������βε����Ͳ�ͬ����������
	public static void define(String name){
		System.out.println(name);
	}// define

	public static void define(int a){
		System.out.println(a);
	}// define

	// �������������βε�˳��ͬ��Ҳ��������
	public static double sum(double a, int b){
		return a + b;
	}// sum

	public static double sum(int a, double b){
		return a + b;
	}// sum

}