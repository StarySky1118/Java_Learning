package com.hypergraph.hashset_exersice;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(new Employee("田所浩二", 2400, new MyDate(1999, 12, 23)));
        set.add(new Employee("德川", 3200, new MyDate(1999, 12, 23)));
        set.add(new Employee("田所浩二", 2400, new MyDate(1999, 12, 23)));

        System.out.println(set);
    }
}
