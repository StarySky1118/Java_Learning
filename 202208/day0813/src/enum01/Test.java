package enum01;

public class Test {
    public static void main(String[] args) {
        try {
            Gender gender = Gender.valueOf("FMALE");
        } catch (IllegalArgumentException e) {
            System.out.println("枚举类中没有这样的枚举对象...");
        }


    }
}
