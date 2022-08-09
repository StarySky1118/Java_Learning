package com.zzy.interface02;

// 电池类
public class Battery implements Socket{



    // 接入电源
    @Override
    public void access() {
        System.out.println("电池已连接电源");
    }

    // 移除电源
    @Override
    public void extract() {
        System.out.println("电池已移除电源");
    }

    // 充电方法
    public void charge() {
        access();
        System.out.println("电池充电中...");
        System.out.println("电池充电完成...");
        extract();
    }
}
