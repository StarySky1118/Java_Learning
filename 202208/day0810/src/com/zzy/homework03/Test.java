package com.zzy.homework03;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("唐僧", Factory.getHorse());
        person.passRiver();
        person.common();
        person.passFireHill();

    }
}
