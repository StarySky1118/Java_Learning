public class IfTest02{
	public static void main(String[] args){
		// 创建扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收天气信息
		System.out.print("请输入天气信息:");
		int weather = s.nextInt();
		while(weather!=0 && weather!=1){
			System.out.print("请重新输入天气信息:");
			weather = s.nextInt();
		}// while

		// 接收性别信息
		System.out.print("请输入性别信息:");
		int sex = s.nextInt();
		while(sex!=1 && sex!=0){
			System.out.print("请重新输入性别信息:");
			sex = s.nextInt();
		}// while

		// 输出
		String action;
		if(weather==1){
			if(sex ==1){
				action = "打一把大黑伞";
			}else{
				action = "打一把小花伞";
			}// else
		}else{
			if(sex ==1){
				action = "直接走起，出去玩耍";
			}else{
				action = "擦点防晒霜，出去玩耍";
			}// else
		}// else

		System.out.println(action);
	}
}