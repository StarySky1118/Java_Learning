package com.zzy.arrays02;

import java.util.Arrays;
import java.util.Comparator;

// 测试类
public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("java从入门到放弃", 300);

        System.out.println("---排序前---");
        System.out.println(Arrays.toString(books));

        // 按照价格降序
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getPrice() - o1.getPrice();
//            }
//        });

        // 按照价格升序
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getPrice() - o2.getPrice();
//            }
//        });

        // 按照名字长度
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        System.out.println("---排序后---");
        System.out.println(Arrays.toString(books));
    }
}
