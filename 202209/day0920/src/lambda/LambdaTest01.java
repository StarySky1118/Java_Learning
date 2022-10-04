package lambda;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.*;

public class LambdaTest01 {
    @Test
    public void test01() {
        Runnable runnable = () -> System.out.println("run...");
        runnable.run();
    }

    @Test
    public void test02() {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator.compare(11, 21));
    }

    @Test
    public void testConsumer() {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("哈哈");

        System.out.println("--------------");

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("哈哈");
    }

    @Test
    public void testSupplier() {
        Supplier<String> supplier = () -> "哈哈";
        System.out.println(supplier.get());

        System.out.println("------");

        Supplier supplier1 = Math::random;
        System.out.println(supplier1.get());
    }

    @Test
    public void testFunction() {
        Function<Integer, Integer> f = i -> i + 2;
        System.out.println(f.apply(1));
    }

    @Test
    public void testPredicate() {
        Predicate<String> predicate = s -> s.contains("琪");
        System.out.println(predicate.test("王钰琪"));

        System.out.println("----");

        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("哈哈", "呵呵"));
    }
}
