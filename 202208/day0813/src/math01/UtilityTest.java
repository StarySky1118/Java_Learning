package math01;

public class UtilityTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.print(Utility.randomInt(0, 100) + " ");
            if (i % 5 == 0)
                System.out.println();
        }
    }
}
