package stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {
    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);

        // 通过集合创建 Stream 对象
        Stream<Integer> stream = list.stream();

//        stream.filter(i -> i > 2).limit(3).forEach(System.out::println)
    }

    @Test
    public void test02() {
        int[] arr = {1, 2, 3, 4, 5};

        // 通过数组创建 Stream 对象
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

    }

    @Test
    public void test03() {
        // 通过 Stream 静态方法 of() 创建
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 6);
        integerStream.forEach(System.out::println);

    }

    @Test
    public void test04() {
        List<String> list = Arrays.asList("aa", "bb", "cc");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static Stream stringToStream(String str) {
        List<Character> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }

    @Test
    public void flatMapTest() {
        List<String> list = Arrays.asList("aa", "bb", "cc");
        list.stream().flatMap(StreamTest01::stringToStream).distinct().forEach(System.out::println);
    }

    @Test
    public void sortTest() {
        List<Integer> list = Arrays.asList(-1, 2, -3, 4, -5);

//        list.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).forEach(System.out::println);

//        System.out.println(list.stream().allMatch(i -> i > 1));

//        System.out.println(list.stream().findAny());

//        System.out.println(list.stream().count());

//        System.out.println(list.stream().max((o1, o2) -> Integer.compare(o2, o1)));

        System.out.println(list.stream().reduce(Integer::sum));
    }
}
