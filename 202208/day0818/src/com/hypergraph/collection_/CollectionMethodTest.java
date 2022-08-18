package com.hypergraph.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethodTest {
    public static void main(String[] args) {

        List list = new ArrayList();

        List list2 = new ArrayList();

        for (int i = 0; i < 4; i++) {
            list2.add(i);
        }

        list.add("矿石");

        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

        // 删除
//        list.remove(1);
//        list.remove((Integer) 1);

//        System.out.println(list.contains(1));
//
//        System.out.println(list.size());
//
//        System.out.println(list.isEmpty());
//
//        list.clear();

        System.out.println(list);
        System.out.println(list2);

        System.out.println(list.containsAll(list2));

        list.removeAll(list2);
        System.out.println(list);
    }
}
