package lambda;

import java.util.Arrays;
import java.util.function.Function;

public class LambdaTest05 {
    public static void main(String[] args) {
        Function<Integer, String[]> f1 = integer -> new String[integer];
        String[] strings = f1.apply(5);
        System.out.println(Arrays.toString(strings));

        Function<Integer, String[]> f2 = String[]::new;
        String[] strings1 = f2.apply(5);
        System.out.println(Arrays.toString(strings1));
    }
}
