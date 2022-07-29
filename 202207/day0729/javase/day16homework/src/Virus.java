public class Virus {
    // 病毒名称
    private String name;

    // 病毒体积
    private double size;

    // 病毒类型
    private String type;

    // 无参构造方法
    public Virus() {
    }

    // 有参构造方法
    public Virus(String name, double size, String type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 攻击方法
    public void attack(Human human) {
        System.out.println(human.getName() + "被" + name + "侵袭");
        human.ill();
    }
}
