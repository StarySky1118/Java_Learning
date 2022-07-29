package com.equalstest;

// 人类
public class Person {
    // 姓名
    private String name;

    // 年龄
    private int age;

    // 性别
    private char gender;

    // 无参构造方法
    public Person() {
    }

    // 有参构造方法
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // 重写equals()方法
    public boolean equals(Object obj) {
        if(this==obj) { // 指向的对象相等
            return true;
        }
        if(obj instanceof Person) { // 若obj是Person对象
            Person person = (Person)obj; // 向下转型
            return name.equals(person.name) && age==person.getAge() && gender==person.getGender() ;
        }
        return false;
    }
}
