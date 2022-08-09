package com.zzy.annoymousinnerclass;

public class Monkey {
    public void swim() {
        Fish fish = new Fish() {
            @Override
            public void swim() {
                System.out.println("猴子也会游泳...");
            }
        };
        System.out.println("fish的运行类型: " + fish.getClass());
        fish.swim();
    }

    public void move() {
        Animal animal = new Animal() {
            @Override
            public void move() {
                System.out.println("猴子跳来跳去...");
            }
        };
        animal.move();
    }
}

