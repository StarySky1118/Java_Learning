// ��ʾ�������ػ���
public class OverloadTest01{
	public static void main(String[] args){
		m1();
		m1("������Ǹ輧��!");
		m1(1);
		m1("����", 250);
		m1(250, "����");
	}

	// �βθ�����ͬ��������
	public static void m1(){
		System.out.println("m1()");
	}// m1()

	public static void m1(String a){
		System.out.println(a);
	}// m1()

	// �β����Ͳ�ͬ��������
	public static void m1(int a){
		System.out.println(a);
	}// m1()

	// �β�˳��ͬ��������
	public static void m1(String a, int b){
		System.out.println(a + b);
	}// m1()

	public static void m1(int a, String b){
		System.out.println(a + b);
	}// m1()

	// ����ֵ��ͬ����������
	/*
		public static int m2(){}
		public static double m2(){}
	*/

	// ���η��б�ͬҲ����������
	/*
		public static void m2(){}
		void m2(){}
	*/
}