package com.hypergraph.arraylist;

import java.util.ArrayList;
import java.util.List;

// ArrayList实现细节
public class ArrayListDetail {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("String");

        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }

        list.add("Git");
    }
}
