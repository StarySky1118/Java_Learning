package com.hypergraph.linkedhashset02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add(new Car("比亚迪", 1000));
        set.add(new Car("劳斯莱斯", 1200));
        set.add(new Car("比亚迪", 1000));

        System.out.println(set);
    }
}
