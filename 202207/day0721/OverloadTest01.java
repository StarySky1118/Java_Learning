// ��ʾ�������ػ���

public class OverloadTest01
{
	public static void main(String[] args)
	{
		System.out.println(bigger(100, 200));
		System.out.println(bigger(100, 200, 300));
		System.out.println(bigger(100.0, 200.0));
	}

	// �������������βεĸ�����ͬ����������
	public static int bigger(int a, int b)
	{// ����a��b�нϴ���
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c)
	{// ���������нϴ���
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()

	// ����ķ���������ķ����β����Ͳ�ͬ����������
	public static double bigger(double a, double b)
	{
		return a > b ? a : b;
	}// bigger()
}