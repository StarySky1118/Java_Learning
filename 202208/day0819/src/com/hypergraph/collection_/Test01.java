package com.hypergraph.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("String");
        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

//        System.out.println(list.remove(0));
//        System.out.println(list.remove((Integer) 1));

//        System.out.println(list.contains("String"));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        System.out.println("---迭代器遍历---");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        System.out.println("---增强for遍历---");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
