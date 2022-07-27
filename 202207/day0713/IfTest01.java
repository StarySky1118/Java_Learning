public class IfTest01{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户键入数据
		System.out.print("请输入您的年龄：");
		int age = s.nextInt();

		// 循环接收直至数据合法
		while(age<0 || age>150){
			System.out.print("请重新输入您的年龄，确保您的脑子无误：");
			age = s.nextInt();
		}// while

		// 根据键入的年龄判断生命阶段
		String stage;
		if(age<=5){
			stage = "拟态baby了";
		}else if(age<=10){
			stage = "你是小学生";
		}else if(age<=18){
			stage = "你是中学生";
		}else if(age<=35){
			stage = "你是一个一个青年啊啊啊啊";
		}else if(age<=55){
			stage = "人到中年";
		}else{
			stage = "你是一个一个老年人";
		}// if
		System.out.println("您所处的生命阶段为" + stage);
	}
}