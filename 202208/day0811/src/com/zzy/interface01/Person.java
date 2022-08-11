package com.zzy.interface01;

// 人类
public class Person {
    private String name; // 姓名
    private Vehicles vehicles; // 载具

    // 构造器
    public Person() {
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    // 平时
    public void common() {
        if(!(vehicles instanceof Horse)) { // 载具不是马
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }

    // 过河
    public void passRiver() {
        if(!(vehicles instanceof Boat)) { // 载具不是船
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

    // 过火焰山
    public void passFireHill() {
        if(!(vehicles instanceof Plane)) { // 载具不是飞机
            vehicles = Factory.getPlane();
        }
        vehicles.work();
    }
}
