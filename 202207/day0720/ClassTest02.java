public class ClassTest02{
	public static void main(String[] args){
		Player lebron_James = new Player();
		Player john_Wall = new Player();
		Player russel_Westbrook = new Player();
		System.out.println("对象已创建完毕！");
		lebron_James.name = "勒布朗·詹姆斯";
		System.out.println(lebron_James.name);
	}
}

class Player
{
	String name; // 姓名
	double salary; // 薪资
	String team; // 所属球队
}// Player