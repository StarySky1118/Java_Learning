// ��ʾ��������

public class OverloadTest01{

	public static void main(String[] args){
		System.out.println(bigger(100, 200));
		System.out.println(bigger(100, 200, 300));
	}// main()

	// �������ַ����βθ�����ͬ����������
	public static int bigger(int a, int b){
	// ����a��b�нϴ���
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c){
	// ����a, b, c�нϴ���
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()

	// ���·������������ַ����β����Ͳ�ͬ��Ҳ��������
	public static double bigger(double a, double b){
		return a > b ? a : b;
	}// bigger()

	// ���������η���ͬ�򷵻�ֵ���Ͳ�ͬ����������
	/*
		public static void m1(){}
		void m1(){}
	*/

	/*
		public static int m2(){}
		public static double m2(){}
	*/
}