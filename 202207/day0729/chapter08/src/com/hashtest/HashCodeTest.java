package com.hashtest;

import com.equalstest.Person;

// 使用hashCode()方法
public class HashCodeTest {
    public static void main(String[] args) {
        Person p1 = new Person("田所浩二", 24, '男');
        Person p2 = p1;
        System.out.println(p1.hashCode()); //460141958
    }
}
