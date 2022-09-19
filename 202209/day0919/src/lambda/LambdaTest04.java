package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaTest04 {
    public static void main(String[] args) {

        // 供给型接口
        // 无参构造器
        Supplier<Person> supplier = Person::new;
        Person person = supplier.get();

        // 函数型接口
        // 有参构造器
        Function<String, Person> f = Person::new;
        f.apply("田所浩二");

        // 二元函数式接口
        BiFunction<String, Integer, Person> biFunction1 = (name, age) -> new Person(name, age);


        BiFunction<String, Integer, Person> biFunction2 = Person::new;
        biFunction2.apply("田所浩二", 24);

    }
}
