package com.hypergraph.exersice01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国志", 18, "陈寿"));
        list.add(new Book("简爱", 89, "安娜"));

        System.out.println("---排序前---");
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("---排序后---");
        Utility.bubbleSort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;

                return (int) (book1.getPrice() - book2.getPrice());
            }
        });
        for (Object o : list) {
            System.out.println(o);
        }


    }
}
