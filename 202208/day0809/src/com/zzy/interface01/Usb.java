package com.zzy.interface01;

// usb接口
public interface Usb {
    String type = "usb_3.0"; // 规格属性

    // 接入方法
    void access();

    // 退出方法
    void quit();

}
