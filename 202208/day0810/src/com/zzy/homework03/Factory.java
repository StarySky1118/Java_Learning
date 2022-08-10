package com.zzy.homework03;

// 工厂类
public class Factory {
    // 一匹马
    public static Horse horse;

    public static Horse getHorse() {
        if (horse == null) {
            horse = new Horse();
        }
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    // 返回飞机
    public static Plane getPlane() {
        return new Plane();
    }
}
