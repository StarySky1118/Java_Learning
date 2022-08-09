package com.zzy.interface01;

// 测试类
public class Test {
    public static void main(String[] args) {
        Usb usb = new Mouse("罗技");
        Computer computer = new Computer();
        computer.usbMgn(usb);
    }
}
