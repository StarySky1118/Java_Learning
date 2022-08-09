package com.zzy.patten02;

// 手机类
public class Phone {
    private String name; // 型号
    private double price; // 价格
    private String soc; // 手机芯片

    // 在类的内部提供引用
    private static Phone phone;

    // 构造器私有化
    private Phone(String name, double price, String soc) {
        this.name = name;
        this.price = price;
        this.soc = soc;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSoc() {
        return soc;
    }

    public void setSoc(String soc) {
        this.soc = soc;
    }

    // 实例获取方法
    public static Phone getInstance() {
        if (phone == null) {
            phone = new Phone("iQOO neo3", 2999, "骁龙865");
        }
        return phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", soc='" + soc + '\'' +
                '}';
    }
}
