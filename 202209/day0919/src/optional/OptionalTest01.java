package optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest01 {

    @Test
    public void test01() {
        Optional<Boy> boy = Optional.of(new Boy());

    }

    @Test
    public void test02() {
        Boy boy = null;

        Optional<Boy> boy1 = Optional.ofNullable(boy);

        Boy boy2 = boy1.orElse(new Boy("田所浩二"));

        System.out.println(boy2);

    }
}
