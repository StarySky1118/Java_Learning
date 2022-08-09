package com.zzy.interface02;

// 测试类
public class Test {
    public static void main(String[] args) {
        Socket socket = new Battery();

        if(socket instanceof Battery) {
            Battery battery = (Battery) socket;
            battery.charge();
        }
    }
}
