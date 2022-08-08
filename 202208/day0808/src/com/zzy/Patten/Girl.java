package com.zzy.Patten;

// 女生类
public class Girl {
    private String name; // 姓名
    private char breastSize; // 胸围

    // 只能在本类中创建对象
    private final static Girl girl = new Girl("王钰琪", 'A');

    // 构造器私有化
    private Girl(String name, char breastSize) {
        this.name = name;
        this.breastSize = breastSize;
    }

    // 返回对象方法
    public static Girl getInstance() {
        return girl;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getBreastSize() {
        return breastSize;
    }

    public void setBreastSize(char breastSize) {
        this.breastSize = breastSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", breastSize=" + breastSize +
                '}';
    }
}
