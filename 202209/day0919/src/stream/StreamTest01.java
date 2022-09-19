package stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest01 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        // 创建顺序流
//        Stream<Integer> stream = list.stream();
//
//        // 创建并行流
//        Stream<Integer> integerStream = list.parallelStream();

//        int[] arr = {1, 2, 3, 4, 5};
//        IntStream stream = Arrays.stream(arr);



    }

    @Test
    public void test1() {
        // 使用 Stream 类静态方法 of()
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4);
    }

    @Test
    public void test2() {
        // 迭代创建无限流
        Stream.iterate(0, t -> t + 2);

        // 生成创建无限流
        Stream.generate(Math::random);
    }
}
