package com.zzy.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayDetail02 {
    public static void main(String[] args) {
        List list = new Vector(12);

        for (int i = 0; i < 12; i++) {
            list.add(i);
        }

        list.add("String");
    }
}
