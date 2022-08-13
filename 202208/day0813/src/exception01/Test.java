package exception01;

// 测试五大运行时异常
public class Test {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("空指针异常...");
        }
    }
}
