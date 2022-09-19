package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest02 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("哈哈");

        Supplier<String> supplier = () -> "哈哈";
        System.out.println(supplier.get());

        Function<String, String> f = (str) -> "哈" + str;
        System.out.println(f.apply("哈"));

        Predicate<String> predicate = (str) -> str.contains("京");
        System.out.println(predicate.test("北京"));
    }
}
