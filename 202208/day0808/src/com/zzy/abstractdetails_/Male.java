package com.zzy.abstractdetails_;

// 男性类
public abstract class Male extends Human {
    private char gender; // 性别

    // 构造器
    public Male(String name, char gender) {
        super(name);
        this.gender = gender;
    }

    // setter and getter
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//    @Override
//    public void eat() {
//        System.out.println("狼吞虎咽...");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("呼呼大睡...");
//    }
}
