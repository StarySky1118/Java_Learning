package com.zzy.abstractdetails_;

// 人类测试类
public class HumanTest {
    public static void main(String[] args) {
        Human human = new Boy("张子亿", '男');
        human.breathe();
        human.eat();
        human.sleep();
    }
}
