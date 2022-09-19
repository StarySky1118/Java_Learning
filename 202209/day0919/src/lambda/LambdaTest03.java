package lambda;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class LambdaTest03 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("哈哈");

        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(11, 1));

        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("哈哈", "呵呵"));
    }
}
