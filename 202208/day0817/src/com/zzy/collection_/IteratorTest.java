package com.zzy.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("desktop");
        list.add(10);
        list.add(true);
        list.add("phone");

        // 得到一个集合的迭代器
        Iterator iterator = list.iterator();
        // 循环遍历，快捷键itit
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        iterator = list.iterator();
    }
}
