package com.zzy.interface01;

public class Test {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10, 15, "褐色");
        System.out.println(cylinder.volume());
        System.out.println(cylinder.area());
    }
}
