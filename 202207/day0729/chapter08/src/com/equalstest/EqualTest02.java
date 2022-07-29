package com.equalstest;

public class EqualTest02 {
    public static void main(String[] args) {
        Person p1 = new Person("田所浩二", 24, '男');
        Person p2 = new Person("田所浩二", 24, '男');
        Person p3 = new Person("田所浩三", 24, '男');
        System.out.println(p1.equals(p3));;

        int i = 1;
        double d = 1.0;
        System.out.println(i == d);
    }
}
