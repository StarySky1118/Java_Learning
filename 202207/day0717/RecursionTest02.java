// ʹ�õݹ�

public class RecursionTest02{
	public static void main(String[] args){
		System.out.println(sum(3));
	}

	public static int sum(int n){
	// �ݹ鷽ʽ��1~n�ĺ�
		if(n==1)
			return 1;
		else
			return n + sum(n-1);
	}// sum()
}