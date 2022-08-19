package com.hypergraph.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList();

        list.add("詹姆斯");
        list.add("邓肯");
        list.add("韦德");
        list.add("库里");

        System.out.println(list);

        // 静态方法 “反转”
        // public static void reverse(List<?> list)
        // Collections.reverse(list);

        // 静态方法 “洗牌”
        // public static void shuffle(List<?> list)
        // Collections.shuffle(list);

        // 静态方法 “排序”
//        Collections.sort(list, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String) o1).length() - ((String) o2).length();
//            }
//        });

        // 静态方法 “交换”
        // public static void swap(List<?> list, int i, int j)
//        Collections.swap(list, 0, 1);

        // 静态方法 “最大/小值”
        // public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)
        // 自然排序/定制排序
//        System.out.println("定制排序最大值：" + Collections.max(list, new Comparator() {
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                return ((String) o1).length() - ((String) o2).length();
//            }
//        }));

        // 静态方法 “出现频率”
        // public static int frequency(Collection<?> c, Object o)
        System.out.println(Collections.frequency(list, "詹姆斯"));

        // 静态方法 “复制”
        // public static void copy(List dest, List src)
        // 注意：拷贝前，目标列表必须与源列表容量相同
//        for (int i = 0; i < list.size(); i++) {
//            list1.add("");
//        }
//
//        Collections.copy(list1, list);

        // 静态方法 “替换”
        // public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)
        Collections.replaceAll(list, "詹姆斯", "库里");

        System.out.println(list);
        System.out.println();
    }
}
