package optional;

import java.util.Optional;

public class OptionalTest {
    public void test01() {
        Person person = null;

        // 装箱
        Optional<Person> person1 = Optional.ofNullable(person);

        // 拆箱
        Person person2 = person1.orElse(new Person());


    }
}
