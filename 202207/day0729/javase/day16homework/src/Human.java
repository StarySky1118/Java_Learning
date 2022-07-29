// 人类
public class Human {
    // 姓名
    private String name;

    // 年龄
    private int age;

    // 性别
    private char sex;

    // 无参构造方法
    public Human() {
    }

    // 有参构造方法
    public Human(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // setter and getter
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    // 生病方法
    public void ill() {
        System.out.println(name + "，" + age + "，" + sex + "，生病了");
    }
}
