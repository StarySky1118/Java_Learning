// ��ʾ�������ػ���
public class OverloadTest02{
	public static void main(String[] args){
		m1("����", "���Ǹ輧");
		m1("����", "���Ǹ輧", "��");
		m1("����", 250);
		m1(250, "����");
	}

	// �������������βθ�����ͬ����������
	public static void m1(String a, String b){
		System.out.println(a + b);
	}// m1()

	public static void m1(String a, String b, String c){
		System.out.println(a + b + c);
	}// m1()

	// ���·����β����������������ͬ����������
	public static void m1(String a, int b){
		System.out.println(a + b);
	}// m1()

	// ���·����β�˳�������������ͬ����������
	public static void m1(int a, String b){
		System.out.println(b + a);
	}// m1()

}