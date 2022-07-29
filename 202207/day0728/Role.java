// 角色类
public class Role{
	// 角色名
	private String name;

	// 血量
	private int health;

	// 无参构造
	public Role(){

	}

	// 有参构造
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

	// 攻击
	public void attack(Role role){
		if(role==null)
			System.out.println("Miss");
		else{
			role.setHealth(role.getHealth()-1);
			System.out.println(name + "对" + role.getName() + "造成伤害！");
			System.out.println(role.getName() + "剩余血量:" + role.getHealth() + "。");
		}
	}
}