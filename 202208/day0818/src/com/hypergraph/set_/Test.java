package com.hypergraph.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();

//        set.add("String");
        set.add(new String("String"));
        set.add(new String("String"));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


    }
}
