public class InputTest01{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û���������
		System.out.print("������һ��������");
		int userInputNum = s.nextInt();
		System.out.println("�����������Ϊ��" + userInputNum);
	}
}