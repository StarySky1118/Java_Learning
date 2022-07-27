public class IfTest01{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入
		System.out.print("请输入你的成绩:");
		double score = s.nextDouble();

		// 如有需要，重复键入直至合法
		while(score<0 || score>100){
			System.out.print("请输入合法的成绩:");
			score = s.nextDouble();
		}// while

		// 根据键入值输出等级
		String grade;
		if(score>=90){
			grade = "优秀";
		}else if(score>=80){
			grade = "良好";
		}else if(score>=70){
			grade = "中等";
		}else if(score>=60){
			grade = "及格";
		}else{
			grade = "不及格";
		}// else
		System.out.println("你的等第是" + grade);
	}

}