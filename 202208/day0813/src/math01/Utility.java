package math01;

public class Utility {

    /**
     * @param a 范围下界
     * @param b 范围上界
     * @return [a, b]之间的随机整数
     */
    public static int randomInt(int a, int b) {
        return (int) (a + Math.random()* (b - a + 1));
    }
}
