package com.zzy.genericinterface;

public class Test {
}

interface flyable<E> {

}

interface able extends flyable<String> {

}

class Bird implements flyable<Double> {
    public <T, R> void run(T t, R r) {

    }

    public static <E> void run(E e) {

    }
}