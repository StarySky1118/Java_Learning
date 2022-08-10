package com.zzy.homework04;


public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(42);
        car1.new AC().flow();
        Car car2 = new Car(37);
        car2.new AC().flow();
        Car car3 = new Car(-2);
        car3.new AC().flow();
    }
}
