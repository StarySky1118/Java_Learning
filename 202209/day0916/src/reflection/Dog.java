package reflection;

public class Dog {
    private String name = "田所浩二"; // 姓名
    private int age = 24; // 年龄

    public String type = "homo";

    public Dog() {
    }

    public Dog(String name, int age) {
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

    public void hi() {
        System.out.println(name + "说hi");
    }

    public void smile() {
        System.out.println(name + "微笑");
    }
}
