package com.hypergraph.multithread;

public class Test01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Thread thread1 = new Thread(dog);
        Thread thread2 = new Thread(cat);

        thread1.start();
        thread2.start();

    }
}
