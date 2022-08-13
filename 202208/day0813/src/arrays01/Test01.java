package arrays01;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 5, 3, -1, 6};
        // 静态方法 “转换为字符串”
        // System.out.println(Arrays.toString(integers));

        // 静态方法 “排序”
        // public static void sort(Object[] a)
        // 默认排序
        // Arrays.sort(integers);

        // 定制排序
        // 传入两个参数：(1) 排序数组 (2) 实现了Comparator接口的匿名内部类，要求实现compare方法
        // 使用接口编程，比较灵活
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) 02;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
