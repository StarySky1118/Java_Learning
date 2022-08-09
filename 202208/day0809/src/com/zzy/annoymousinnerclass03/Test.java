package com.zzy.annoymousinnerclass03;

public class Test {
    public static void main(String[] args) {
        Glass_Work.work(new Glass() {
            @Override
            public void refract() {
                System.out.println("凹透镜工作...");
            }
        });
    }
}
