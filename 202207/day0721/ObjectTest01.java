public class ObjectTest01
{
	public static void main(String[] args)
	{
		// ������ַ����
		Address lADowntown = new Address();
		lADowntown.city = "��ɼ�";
		lADowntown.block = "�³���";
		
		// ������Ӷ���
		Team lakers = new Team();
		lakers.name = "����";
		lakers.addr = lADowntown;
		
		// ������Ա����
		Player lebron_James = new Player();
		lebron_James.name = "�ղ��ʡ�ղķ˹";
		lebron_James.team = lakers;

		// ����ղķ˹������ӵĵ�ַ
		System.out.println(lebron_James.team.addr.city + lebron_James.team.addr.block);
	}
}

class Player
{
	String name; // ����
	Team team; // �������
}// Player

class Team
{
	String name; // �������
	Address addr; // ��ӵ�ַ
}// Team

class Address
{
	String city; // ����
	String block; // ����
}// Address