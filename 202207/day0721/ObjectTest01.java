public class ObjectTest01
{
	public static void main(String[] args)
	{
		// 创建地址对象
		Address lADowntown = new Address();
		lADowntown.city = "洛杉矶";
		lADowntown.block = "下城区";
		
		// 创建球队对象
		Team lakers = new Team();
		lakers.name = "湖人";
		lakers.addr = lADowntown;
		
		// 创建球员对象
		Player lebron_James = new Player();
		lebron_James.name = "勒布朗·詹姆斯";
		lebron_James.team = lakers;

		// 访问詹姆斯所在球队的地址
		System.out.println(lebron_James.team.addr.city + lebron_James.team.addr.block);
	}
}

class Player
{
	String name; // 姓名
	Team team; // 所属球队
}// Player

class Team
{
	String name; // 球队名称
	Address addr; // 球队地址
}// Team

class Address
{
	String city; // 城市
	String block; // 街区
}// Address