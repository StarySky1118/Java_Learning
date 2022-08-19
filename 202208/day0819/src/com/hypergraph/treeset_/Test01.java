package com.hypergraph.treeset_;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
    public static void main(String[] args) {
        Set set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o1);
            }
        });

        set.add("Kevin");
        set.add("LeBron");
        set.add("Bill");
    }
}
