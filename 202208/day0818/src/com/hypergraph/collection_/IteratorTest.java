package com.hypergraph.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 集合遍历
public class IteratorTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("戴尔");
        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

        System.out.println("---迭代器遍历---");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("---增强for遍历---");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
