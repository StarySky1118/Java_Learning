// ��ʾ�������ػ���
public class MethodTest02{
	public static void main(String[] args){
		m1();
		m1(100);
		m2(100);
		m2(1.0);
		m3(100, 3.14);
		m3(3.14, 100);
	}

	// �����������������ĸ�����ͬ����������
	public static void m1(){
		System.out.println("m1()");
	}

	public static void m1(int a){
		System.out.println("m1(int a)");
	}

	// ���������������������Ͳ�ͬ����������
	public static void m2(int a){
		System.out.println("m2(int a)");
	}

	public static void m2(double a){
		System.out.println("m2(double a)");
	}

	// ������������������˳��ͬ��Ҳ��������
	public static void m3(int a, double b){
		System.out.println("m3(int a, double b)");
	}

	public static void m3(double a, int b){
		System.out.println("m3(double a, int b)");
	}

}