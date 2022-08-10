package com.zzy.homework01;

// 连衣裙类
public class Frock {
    private static int currentNum = 100000; // 序列号初始值

    private int serialNumber; // 序列号

    // 构造器
    public Frock() {
        serialNumber = getNextNum();
    }

    // 序列号get方法
    public int getSerialNumber() {
        return serialNumber;
    }

    // 生成连衣裙唯一序列号
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
