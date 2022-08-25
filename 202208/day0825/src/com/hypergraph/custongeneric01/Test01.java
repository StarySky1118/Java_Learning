package com.hypergraph.custongeneric01;

import java.util.List;

public class Test01 {

    public static void main(String[] args) {
    }

    public static void print(List<?> list) {
        System.out.println(list);
    }
}

class Tiger<E> {
    E e;
}

interface flyable<T> {

}

interface AB extends flyable<String> {

}