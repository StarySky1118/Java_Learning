// ��ʾ�������ػ���

public class MethodTest04{
	public static void main(String[] args){
		merge("����", "����");
		merge("�Ҿ���", "�輧", "��");
		merge("����", 250);
		merge(250, "����");
	}// main()

	// �������������βθ�����ͬ����������
	public static void merge(String a, String b){
	// ʵ�������ַ�����ƴ�����
		System.out.println(a + b);
	}// merge()

	public static void merge(String a, String b, String c){
	// ʵ�������ַ�����ƴ�����
		System.out.println(a + b + c);
	}// merge()

	// �������������β����Ͳ�ͬ��Ҳ��������
	public static void merge(String a, int b){
		System.out.println(a + b);
	}// merge()

	public static void merge(int a, String b){
		System.out.println(a + b);
	}// merge()
}