package com.hypergraph.linkedhashset01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add("凯文·杜兰特");
        set.add("拉塞尔·维斯布鲁克");
        set.add("勒布朗·詹姆斯");

        System.out.println(set);
    }

}
