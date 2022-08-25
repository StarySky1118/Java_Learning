package com.zzy.genericextends;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<A> list1 = new ArrayList<>();
        List<B> list2 = new ArrayList<>();
        List<C> list3 = new ArrayList<>();

        print01(list1);
        print01(list2);
        print01(list3);

        print02(list1);
        print02(list2);
        print02(list3);

        print03(list1);
        print03(list2);

    }

    public static void print01(List<?> list) {
        System.out.println(list);
    }

    public static void print02(List<? extends A> list) {

    }

    public static void print03(List<? super B> list) {

    }
}

class A {}

class B extends A {}

class C extends B {}