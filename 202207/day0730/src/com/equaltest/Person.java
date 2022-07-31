package com.equaltest;

// 人类
public class Person {
    // 姓名
    private String name;

    // 年龄
    private int age;

    // 性别
    private char gender;

    // 无参构造
    public Person() {
    }

    // 有参构造
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
    // 若指向对象的属性完全相同，则返回true
    @Override
    public boolean equals(Object obj) {
        if(this == obj) { // 指向同一对象
            return true;
        }
        if(obj instanceof Person) { // obj指向Person对象
            Person person = (Person)obj; // 向下转型来访问子类特有属性
            return name == person.getName() && age ==person.getAge() && gender == person.getGender();
        }
        return false;
    }
}
