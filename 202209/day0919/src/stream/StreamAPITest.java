package stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPITest {

    @Test
    public void test1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);

        Stream<Integer> stream = list.stream();

        // 过滤
//        stream.filter(i -> i > 1).forEach(System.out::println);

        // 截断
//        stream.filter(i -> i > 1).limit(2).forEach(System.out::println);

        // 跳过
//        stream.filter(i -> i > 1).skip(1).limit(2).forEach(System.out::println);

        // 去重
        stream.distinct().forEach(System.out::println);
    }

    @Test
    public void test2() {
        List<String> strings = Arrays.asList("aa", "bb", "cc");
        Stream<String> stream = strings.stream();

        stream.map(str -> str.toUpperCase()).forEach(System.out::println);
    }

    public static Stream stringToStream(String str) {
        List list = new ArrayList();

        for (char c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();

    }

    @Test
    public void test3() {
        List<String> list = Arrays.asList("aa", "bb", "cc");

        list.stream().flatMap(StreamAPITest::stringToStream).forEach(System.out::println);
    }

    @Test
    public void test4() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-1);
        list.add(3);
        list.add(5);
        list.add(-2);

//        list.stream().sorted().forEach(System.out::println);

//        list.stream().sorted((o1, o2) -> Integer.compare(o2, o1)).forEach(System.out::println);

        list.stream().sorted(Integer::compare).forEach(System.out::println);
    }
}
