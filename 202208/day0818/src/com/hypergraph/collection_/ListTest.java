package com.hypergraph.collection_;


import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // List支持索引
        List list = new ArrayList();

        list.add("款式");

        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

        System.out.println(list.get(1));
    }
}
