package com.zzy.interface01;

// 鼠标类
public class Mouse implements Usb{

    private String name; // 品牌与型号

    // 构造器
    public Mouse(String name) {
        this.name = name;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void access() {
        System.out.println(name + "接入usb");
    }

    @Override
    public void quit() {
        System.out.println(name + "拔出usb");
    }
}
