package com.zzy.listexercise_;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));

        Utility.bubbleSort(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println(list.size());
    }
}
