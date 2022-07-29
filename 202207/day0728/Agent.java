// 干员类继承角色类
public class Agent extends Role{
	// 士气
	private int spirit;

	// 无参构造方法
	public Agent(){

	}

	// 有参构造方法
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

	// 攻击
	public void attack(Role role){
		if(role==null)
			System.out.println("Miss");
		else{
			role.setHealth(role.getHealth()-1);
			System.out.println(getName() + "对" + role.getName() + "造成伤害！");
			spirit +=1;
			System.out.println(getName() + "当前士气值:" + spirit);
			System.out.println(role.getName() + "剩余血量:" + role.getHealth() + "。");
		}
	}
}