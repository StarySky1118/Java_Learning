package com.zzy.innerclass02;

public class Test {
    public static void main(String[] args) {
        Fly fly = new Fly() {

            @Override
            public void fly() {
                System.out.println("扑闪翅膀飞...");
            }
        };
        fly.fly();
    }
}
