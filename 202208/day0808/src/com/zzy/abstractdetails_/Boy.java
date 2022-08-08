package com.zzy.abstractdetails_;

// 男生类
public class Boy extends Male{
    public Boy(String name, char gender) {
        super(name, gender);
    }

    @Override
    public void eat() {
        System.out.println("男生吃饭...");
    }

    @Override
    public void sleep() {
        System.out.println("男生睡觉...");
    }
}
