package com.zzy.abstract01;

// 坦克类
public class Tank extends Weapon{

    // 攻击
    @Override
    public void attack() {
        System.out.println("发射炮弹...");
    }

    // 移动
    @Override
    public void move() {
        System.out.println("使用履带移动...");
    }
}
