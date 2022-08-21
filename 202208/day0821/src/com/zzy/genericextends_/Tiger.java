package com.zzy.genericextends_;

import java.util.List;

public class Tiger {
    public static void printCollection(List<?> list) {
        System.out.println(list);
    }

    public static void printCollection1(List<? extends Number> list) {
        System.out.println(list);
    }
}
