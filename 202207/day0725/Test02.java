// ��̬������ʵ������������

public class Test02{
	public static void main(String[] args){
		// ���þ�̬����
		System.out.println(addString("����", "û����"));

		// ����ʵ������
		Test02 t = new Test02();
		System.out.println(t.addString2("����", "û����"));
	}// main()

	// ��̬����
	public static String addString(String a, String b){
		return a + b;
	}// addString()

	// ʵ������
	public String addString2(String a, String b){
		return a + b;
	}// addString2()
}