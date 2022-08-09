package com.zzy.annoymousinnerclass02;

// 测试类
public class Test {
    private static String name = "田所浩二";

    public static void main(String[] args) {

        new DigitalDevice() {
            private String name = "德川";

            @Override
            public void on() {
                System.out.println("手机启动...");
            }

            @Override
            public void off() {
                System.out.println("手机关机...");
            }

            public void showName() {
                System.out.println("内部类name: " + name + "外部类name: " + Test.name);
            }
        }.showName();
    }
}
