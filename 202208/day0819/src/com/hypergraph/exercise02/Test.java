package com.hypergraph.exercise02;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        map.put("jack", 2600);
        System.out.println(map);

        System.out.println("---加薪后---");
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry entry = (Map.Entry) o;
            entry.setValue((Integer)(entry.getValue()) + 100);
        }
        System.out.println(map);

        System.out.println("---所有员工---");
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("---所有薪资---");
        Collection values = map.values();
        for (Object o : values) {
            System.out.println(o);
        }


    }
}
