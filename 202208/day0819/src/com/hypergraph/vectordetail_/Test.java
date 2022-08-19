package com.hypergraph.vectordetail_;

import java.util.List;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        List list = new Vector();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.add("String");
    }
}
