public class OverloadTest02{
	public static void main(String[] args){
		System.out.println(bigger(10, 20));
		System.out.println(bigger(10, 20, 30));
	}// main()

	public static int bigger(int a, int b){
	// ������������a,b�нϴ���
		return a > b ? a : b;
	}// bigger()

	public static int bigger(int a, int b, int c){
	// ����������������a, b, c�нϴ���
		int x = bigger(a, b);
		return x > c ? x : c;
	}// bigger()
}