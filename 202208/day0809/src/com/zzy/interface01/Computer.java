package com.zzy.interface01;

// 电脑类
public class Computer {
    // 控制usb方法
    public void usbMgn(Usb usb) {
        usb.access();
        usb.quit();
    }
}
