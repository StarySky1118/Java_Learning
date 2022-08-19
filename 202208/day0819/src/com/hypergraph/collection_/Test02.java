package com.hypergraph.collection_;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Book("小王子", 20, "乔伊"));
        list.add(new Book("简爱", 15, "罗斯"));
        list.add(new Book("基督山伯爵", 25, "莫妮卡"));
        list.add(new Book("飞", 12, "钱德勒"));

        Utility.bubbleSort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;

                if(book1.getPrice() > book2.getPrice()) {
                    return 1;
                }
                if (book1.getPrice() < book2.getPrice()) {
                    return -1;
                }
                return 0;

            }
        });

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
