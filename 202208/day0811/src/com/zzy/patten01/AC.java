package com.zzy.patten01;

// 空调类单例设计模式
public class AC {
    private String name; // 型号
    private int power; // 功率
    public static final int a = 100;

    static {
        System.out.println("类加载...");
    }

    // 在类的内部创建对象/提供引用
    private static AC ac;

    // 构造器私有化
    private AC(String name, int power) {
        this.name = name;
        this.power = power;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // 提供对象
    public static AC getInstance() {
        if (ac == null) {
            ac = new AC("田所浩二", 1);
        }
        return ac;
    }

    @Override
    public String toString() {
        return "AC{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
