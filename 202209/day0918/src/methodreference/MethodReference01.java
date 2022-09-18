package methodreference;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class MethodReference01 {
    public static void main(String[] args) {
        // Consumer void accept(T t) 和 PrintStream void println(T t)
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");

        // Comparator int compare(T t1, T t2)
        // Integer int compareTo(T t1, T t2)
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(11, 21));

        // BiPredicate boolean test(T t, U u)
        // String equals(String anotherString)
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("hello", "hello"));
    }
}
