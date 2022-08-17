package com.zzy.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionFor {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("王钰琪");
        list.add(42);
        list.add(true);

        for(Object object : list) {
            System.out.println(object);
        }

    }
}
