package com.zzy.abstract01;

// 手机类
public class Phone extends DigitalDevice {

    // 实现充电方法
    @Override
    public void charge() {
        System.out.println("手机充电中...");
    }

    @Override
    public void discharge() {
        System.out.println("手机放电中...");
    }
}
