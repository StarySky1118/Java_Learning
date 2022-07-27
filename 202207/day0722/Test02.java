public class Test02{
	public static void main(String[] args){
		Team Nets = new Team("篮网", "布鲁克林");
		Player kevin_Durant = new Player("凯文·杜兰特", Nets);
		System.out.println(kevin_Durant.getName() + "在" + kevin_Durant.getTeam().getCity() + kevin_Durant.getTeam().getTeamName());
	}	
}

class Player{
// 球员类
	// 球员姓名
	private String name;

	// 所属球队
	private Team team;

	// 无参构造器
	public Player(){}

	// 全参构造器
	public Player(String name, Team team){
		this.name = name;
		this.team = team;
	}// Player()

	// get方法
	public String getName(){
		return name;
	}// getName()

	public Team getTeam(){
		return team;
	}

	// set方法
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setTeam(Team team){
		this.team = team;
	}// setTeam()
}// Player

class Team{
// 球队类
	// 队名
	private String teamName;

	// 所在城市
	private String city;

	// 无参构造器
	public Team(){}

	// 有参构造器
	public Team(String teamName, String city){
		this.teamName = teamName;
		this.city = city;
	}// Team()

	// get方法
	public String getTeamName(){
		return teamName;
	}// getTeamName()

	public String getCity(){
		return city;
	}

	// set方法
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}// setTeamName()

	public void setCity(String city){
		this.city = city;
	}// setCity()

}