// ��Ա��̳н�ɫ��
public class Agent extends Role{
	// ʿ��
	private int spirit;

	// �޲ι��췽��
	public Agent(){

	}

	// �вι��췽��
	public Agent(int spirit, String name, int health){
		this.spirit = spirit;
		setName(name);
		setHealth(health);
	}

	// setter and getter
	public void setSpirit(int spirit){
		this.spirit = spirit;
	}

	public int getSpirit(){
		return spirit;
	}

	// ����
	public void attack(Role role){
		if(role==null)
			System.out.println("Miss");
		else{
			role.setHealth(role.getHealth()-1);
			System.out.println(getName() + "��" + role.getName() + "����˺���");
			spirit +=1;
			System.out.println(getName() + "��ǰʿ��ֵ:" + spirit);
			System.out.println(role.getName() + "ʣ��Ѫ��:" + role.getHealth() + "��");
		}
	}
}