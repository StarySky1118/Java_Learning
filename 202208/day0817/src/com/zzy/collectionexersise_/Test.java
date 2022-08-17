package com.zzy.collectionexersise_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog xiaoSai = new Dog("赛赛", 16);
        Dog clown = new Dog("小丑", 5);
        Dog spot = new Dog("斑点", 14);

        List list = new ArrayList();
        list.add(xiaoSai);
        list.add(clown);
        list.add(spot);

        System.out.println("---迭代器遍历---");
        // 迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("---增强for遍历---");
        // 增强for遍历
        for (Object dog : list) {
            System.out.println(dog);
        }

    }
}
