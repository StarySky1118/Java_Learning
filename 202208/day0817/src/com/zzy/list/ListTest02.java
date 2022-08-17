package com.zzy.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// List遍历的几种方式
public class ListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("风笛");
        list.add("能天使");
        list.add("史尔特尔");
        list.add("泥岩");

        // 使用迭代器
        System.out.println("---使用迭代器遍历---");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        // 使用增强for
        System.out.println("---使用增强for遍历---");
        for (Object o : list) {
            System.out.println(o);
        }

        // 使用普通for遍历
        System.out.println("---使用普通for遍历---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
