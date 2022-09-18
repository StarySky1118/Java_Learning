package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest02 {
    public static void main(String[] args) {
        // 消费型接口
        Consumer<String> con = s -> System.out.println("s");
        con.accept("张三");

        // 供给型接口
        Supplier<String> supplier = () -> "你好";
        System.out.println(supplier.get());

        // 函数型接口
        Function<Integer, String> f = o1 -> o1.toString();
        System.out.println(f.apply(11));

        // 断言型接口
        Predicate<String> predicate = s -> {
            if(s.equals("Fuck")) {
                return true;
            }
            return false;
        };
        System.out.println(predicate.test("Fuck"));
    }
}
