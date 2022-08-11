package com.zzy.innerclass03;

// 汽车类
public class Car {
    private double temperature; // 温度

    // 构造器
    public Car(double temperature) {
        this.temperature = temperature;
    }

    // getter and setter
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // 空调内部类
    public class AC {
        public void flow() {
            if (temperature >= 40) {
                System.out.println("吹冷风...");
            } else if (temperature >= 0) {
                System.out.println("停止工作...");
            } else {
                System.out.println("吹热风...");
            }
        }
    }

    // 返回空调对象
    public AC getAC() {
        return new AC();
    }

}
