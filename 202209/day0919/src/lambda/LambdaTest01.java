package lambda;

import java.util.Comparator;

public class LambdaTest01 {
    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("run...");
//        runnable.run();

        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator.compare(11, 21));
    }
}
