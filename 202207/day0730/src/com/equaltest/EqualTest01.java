package com.equaltest;

//重写equals()方法
public class EqualTest01 {
    public static void main(String[] args) {
        Person person1 = new Person("田所浩二", 24, '男');
        Person person2 = new Person("田所浩二", 24, '男');
        Person person3 = new Person("田所浩三", 24, '男');
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.getClass());

    }
}
