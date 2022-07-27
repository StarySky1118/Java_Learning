public class IfTest01{
	public static void main(String[] args){
		int age; // 用于接收用户键入的年龄
		
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入的整数
		do
		{
			System.out.print("请输入年龄:");
			age = s.nextInt(); // 接收键入年龄
			if(age>=0 && age<=150) // 合法年龄
			{
				break;
			}// if
		}while (true);

		// 根据键入的整数判断生命阶段
		if(age<=5){
			System.out.println("婴幼儿");
		}else if(age<=10){
			System.out.println("少儿");
		}else if(age<=18){
			System.out.println("少年");
		}else if(age<=35){
			System.out.println("青年");
		}else if(age<=55){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}// else
	}// main()
}// IfTest01