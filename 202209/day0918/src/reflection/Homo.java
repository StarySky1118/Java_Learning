package reflection;

public class Homo {

    private String name = "田所浩二"; // 实例变量，准备阶段不会分配空间
    public static char gender = '男'; // 静态变量，准备阶段会分配内存空间，赋初始值\u0000
    public static final int n1 = 10; // static final变量，准备阶段分配内存空间，赋最终值10
    public int age = 24;

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

    public void hi() {
        System.out.println(name + "撅了远野");
    }
}
