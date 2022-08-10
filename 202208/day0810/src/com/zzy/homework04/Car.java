package com.zzy.homework04;

// 汽车类
public class Car {
    private double temperature; // 温度

    class AC {

        // 吹风
        public void flow() {
            if (temperature >= 40) { // 温度高于40
                System.out.println("空调吹冷风...");
            } else if (temperature >= 0) {
                System.out.println("空调停止工作...");
            } else {
                System.out.println("空调吹热风...");
            }
        }

    }

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
}
