package com.zzy.abstract01;

public class Test {
    public static void main(String[] args) {
        Weapon weapon = new Tank();
        weapon.attack();
        weapon.move();
    }
}
