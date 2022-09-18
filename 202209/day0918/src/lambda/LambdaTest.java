package lambda;

import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            System.out.println("run...");
//        };
//        runnable.run();

//        Comparator<Integer> com1 = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                System.out.println(o1);
//                System.out.println(o2);
//                return o1.compareTo(o2);
//            }
//        };
//        System.out.println(com1.compare(11, 12));

//        Comparator<Integer> com1 = (o1, o2) -> {
//            System.out.println(o1);
//            System.out.println(o2);
//            return o1.compareTo(o2);
//        };
//        System.out.println(com1.compare(23, 11));

        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    }
}
