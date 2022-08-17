package com.zzy.arrays02;

import java.util.Arrays;
import java.util.Comparator;

// 书本测试类
public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("夏洛的网", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃", 300);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getName().length() - o2.getName().length());
            }
        });

        System.out.println(Arrays.toString(books));
    }
}
