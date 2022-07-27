public class SwitchTest02{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 用户键入数据
		System.out.print("请输入成绩:");
		int score = s.nextInt();
		while(score<0||score>100){
			System.out.print("成绩非法，请重新输入成绩:");
			score = s.nextInt();
		}// while

		// 根据键入数据输出等第
		String grade;
		switch(score/10){
		case 9 : case 10 :
			grade = "优";
			break;
		case 8 : 
			grade = "良";
			break;
		case 7 : 
			grade = "中";
			break;
		case 6 : 
			grade = "及格";
			break;
		default : 
			grade = "不及格";
		}
		System.out.println(grade);
	}
}