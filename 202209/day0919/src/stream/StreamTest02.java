package stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {

    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        System.out.println(list.stream().allMatch(i -> i > 1));

//        System.out.println(list.stream().findFirst());

//        System.out.println(list.stream().count());

        System.out.println(list.stream().max((o1, o2) -> Integer.compare(o2, o1)));
    }

    @Test
    public void test02() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

//        System.out.println(list.stream().reduce(0, Integer::sum));

//        System.out.println(list.stream().reduce(Integer::sum));

        List<Integer> collect = list.stream().filter(i -> i > 1).collect(Collectors.toList());
        System.out.println(collect);

    }


}
