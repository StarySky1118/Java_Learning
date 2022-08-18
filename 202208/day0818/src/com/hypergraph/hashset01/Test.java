package com.hypergraph.hashset01;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set set = new HashSet();

        set.add(new Employee("田所浩二", 24));
        set.add(new Employee("田所浩二", 24));
        set.add(new Employee("我修院", 23));
        set.add(new Employee("德川", 22));
    }
}
