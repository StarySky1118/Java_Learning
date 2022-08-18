package com.hypergraph.linkedlist_;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("String");
        list.add("Fuck");

        list.remove("Fuck");
        list.remove("String");

        System.out.println(list);
    }
}
