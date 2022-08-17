package com.zzy.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("能天使");
        list.add("棘刺");
        list.add("山");
        list.add("银灰");
        list.add("煌");
        list.add("泥岩");
        list.add("艾丽妮");
        list.add("假日威龙陈");
        list.add("水月");

        System.out.println("---操作之前---");
        System.out.println(list);
        list.add(1, "韩顺平教育");
        System.out.println("四号元素为" + list.get(4));
        list.remove(5);
        list.set(6, "博士");
        System.out.println("---操作之后---");
        System.out.println(list);

        // 使用迭代器遍历集合
        System.out.println("---迭代器遍历---");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
