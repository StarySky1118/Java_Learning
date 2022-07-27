public class IfTest02{
	public static void main(String[] args)
	{
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入
		System.out.print("请输入成绩值:");
		int score = s.nextInt();

		// 判断键入是否合法
		while(score<0 || score>100)
		{
			System.out.print("成绩非法，请重新输入:");
			score = s.nextInt();
		}// while

		// 根据键入值输出等第
		String grade;
		if(score>=90){
			grade = "优秀";
		}else if (score>=80){
			grade = "良好";
		}else if (score>=60){
			grade = "及格";
		}else{
			grade = "不及格";
		}// if
		System.out.println("你的等第是" + grade);

	}
}