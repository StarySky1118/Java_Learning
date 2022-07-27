public class RecursionTest01{
	public static void main(String[] args){
		System.out.println(sum(10));
	}// main()

	public static int sum(int n){
	// ¼ÆËã1~nµÄºÍ
		int sum=0;
		for(int i=1;i<=n;i++){
			sum += i;
		}// for
		return sum;
	}// sum
}