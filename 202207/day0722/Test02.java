public class Test02{
	public static void main(String[] args){
		Team Nets = new Team("����", "��³����");
		Player kevin_Durant = new Player("���ġ�������", Nets);
		System.out.println(kevin_Durant.getName() + "��" + kevin_Durant.getTeam().getCity() + kevin_Durant.getTeam().getTeamName());
	}	
}

class Player{
// ��Ա��
	// ��Ա����
	private String name;

	// �������
	private Team team;

	// �޲ι�����
	public Player(){}

	// ȫ�ι�����
	public Player(String name, Team team){
		this.name = name;
		this.team = team;
	}// Player()

	// get����
	public String getName(){
		return name;
	}// getName()

	public Team getTeam(){
		return team;
	}

	// set����
	public void setName(String name){
		this.name = name;
	}// setName()

	public void setTeam(Team team){
		this.team = team;
	}// setTeam()
}// Player

class Team{
// �����
	// ����
	private String teamName;

	// ���ڳ���
	private String city;

	// �޲ι�����
	public Team(){}

	// �вι�����
	public Team(String teamName, String city){
		this.teamName = teamName;
		this.city = city;
	}// Team()

	// get����
	public String getTeamName(){
		return teamName;
	}// getTeamName()

	public String getCity(){
		return city;
	}

	// set����
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}// setTeamName()

	public void setCity(String city){
		this.city = city;
	}// setCity()

}