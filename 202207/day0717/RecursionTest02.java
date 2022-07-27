// 使用递归

public class RecursionTest02{
	public static void main(String[] args){
		System.out.println(sum(3));
	}

	public static int sum(int n){
	// 递归方式求1~n的和
		if(n==1)
			return 1;
		else
			return n + sum(n-1);
	}// sum()
}