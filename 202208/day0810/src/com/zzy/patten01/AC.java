package com.zzy.patten01;

// 空调类
public class AC {
    private String brand; // 品牌
    private int powerConsumptionLevel; // 功耗等级
    private double power; // 功率

    // 在类的内部创建对象/提供引用
    private static AC ac;

    // 构造器私有化
    private AC(String brand, int powerConsumptionLevel, double power) {
        this.brand = brand;
        this.powerConsumptionLevel = powerConsumptionLevel;
        this.power = power;
    }

    // getter and getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPowerConsumptionLevel() {
        return powerConsumptionLevel;
    }

    public void setPowerConsumptionLevel(int powerConsumptionLevel) {
        this.powerConsumptionLevel = powerConsumptionLevel;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    // 返回对象
    public static AC getInstance() {
        if (ac == null) {
            ac = new AC("美的", 1, 1.5);
        }
        return ac;
    }

    @Override
    public String toString() {
        return brand + "品牌" +
                powerConsumptionLevel + "等级" +
                power + "匹";
    }
}
