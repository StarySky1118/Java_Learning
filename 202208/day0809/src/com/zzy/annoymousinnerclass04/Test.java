package com.zzy.annoymousinnerclass04;

// 测试类
public class Test {
    public static void main(String[] args) {
        Phone xiaoMi = new Phone();
        Phone iphone = new Phone();

        xiaoMi.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("谁特么买小米啊...");
            }
        });

        iphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("我一直用的华为手机啊...");
            }
        });
    }
}
