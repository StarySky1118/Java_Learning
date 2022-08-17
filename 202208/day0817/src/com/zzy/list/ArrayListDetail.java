package com.zzy.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDetail {
    public static void main(String[] args) {
        List list = new ArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add("String");

        System.out.println(list);
    }
}
