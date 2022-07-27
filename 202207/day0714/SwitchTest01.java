public class SwitchTest01{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入
		System.out.print("请输入一个整数：");
		int userInputNum = s.nextInt();

		// 输出
		String day;
		switch(userInputNum){
		case 1: case 2: case 3:
			day = "星期一";
			break;
		case 4:
			day = "星期四";
			break;
		case 5:
			day = "星期五";
			break;
		case 6:
			day = "星期六";
			break;
		default:
			day = "星期日";
		}// switch
		System.out.println(day);
	}

}