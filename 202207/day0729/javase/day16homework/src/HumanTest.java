// 人类测试类
public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("田所浩二", 24, '男');
        Virus v1 = new Virus("天花病毒", 0.01, "传染病");
        v1.attack(h1);
    }
}
