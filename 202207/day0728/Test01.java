public class Test01{
	public static void main(String[] args){
		Agent amiya = new Agent(0, "�����", 1200);
		Role soldier = new Role("����", 1300);
		amiya.attack(soldier);
	}
}