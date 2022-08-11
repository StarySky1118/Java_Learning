package com.zzy.innerclass03;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(42);
        Car car2 = new Car(20);
        Car car3 = new Car(-1);

        car1.getAC().flow();
        car2.getAC().flow();
        car3.getAC().flow();
    }
}
