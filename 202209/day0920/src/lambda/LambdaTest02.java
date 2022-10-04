package lambda;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaTest02 {
    @Test
    public void test01() {
        Function<String, Person> f = Person::new;
        Person person = f.apply("田所浩二");
        System.out.println(person.getName());

        BiFunction<String, Integer, Person> biFunction = Person::new;
        Person person1 = biFunction.apply("德川", 24);
        System.out.println(person1);
    }
}
