public class InputTest01{
	public static void main(String[] args)
	{
		// ����һ���û�ɨ��������
		java.util.Scanner s  = new java.util.Scanner(System.in);

		// �Ӽ����Ͻ���һ��int
		System.out.println("������һ������:");
		int i = s.nextInt();

		System.out.println("�����������Ϊ��" + i);
	}
}