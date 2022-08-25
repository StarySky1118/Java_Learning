package com.hypergraph.threadexit;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Dog dog = new Dog();

        Thread thread = new Thread(dog);

        thread.start();

        Thread.sleep(5 * 1000);
        dog.setLoop(false);
    }
}
