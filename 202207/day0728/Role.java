// ��ɫ��
public class Role{
	// ��ɫ��
	private String name;

	// Ѫ��
	private int health;

	// �޲ι���
	public Role(){

	}

	// �вι���
	public Role(String name, int health){
		this.name = name;
		this.health = health;
	}

	// setter and getter
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setHealth(int health){
		this.health = health;
	}

	public int getHealth(){
		return health;
	}

	// ����
	public void attack(Role role){
		if(role==null)
			System.out.println("Miss");
		else{
			role.setHealth(role.getHealth()-1);
			System.out.println(name + "��" + role.getName() + "����˺���");
			System.out.println(role.getName() + "ʣ��Ѫ��:" + role.getHealth() + "��");
		}
	}
}