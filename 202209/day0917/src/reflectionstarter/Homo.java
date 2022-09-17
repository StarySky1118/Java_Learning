package reflectionstarter;

public class Homo {
    private String name = "田所浩二";
    private int age = 24;

    // 构造器
    public Homo() {
    }

    public Homo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void jue() {
        System.out.println(name + "撅远野");
    }
}
