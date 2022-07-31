package com.zzy.equaltest;
// 人类
public class Person {
    private String name; // 姓名
    private int age; // 年龄
    private char gender; // 性别

    // 构造方法
    public Person() {
    }

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

    @Override
    public boolean equals(Object obj) {
        if(this == obj) { // 当前对象和obj指向的对象时同一对象
            return true;
        }

        if(obj instanceof Person) { // obj指向的对象是Person的实例
            Person person = (Person) obj; // 向下转型
            return name == person.getName() && age == person.getAge() && gender == person.getGender();
        }
        return false; // obj指向的对象不是Person的实例
    }
}
