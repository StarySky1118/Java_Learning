package com.hypergraph.threaduse02;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();

        Thread thread = new Thread(dog);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "i=" + i);
        }
    }
}
