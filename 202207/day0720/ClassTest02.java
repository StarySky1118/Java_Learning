public class ClassTest02{
	public static void main(String[] args){
		Player lebron_James = new Player();
		Player john_Wall = new Player();
		Player russel_Westbrook = new Player();
		System.out.println("�����Ѵ�����ϣ�");
		lebron_James.name = "�ղ��ʡ�ղķ˹";
		System.out.println(lebron_James.name);
	}
}

class Player
{
	String name; // ����
	double salary; // н��
	String team; // �������
}// Player