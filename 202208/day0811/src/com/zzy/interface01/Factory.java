package com.zzy.interface01;

// 交通工具工厂
public class Factory {
    // 库存中的马和船
    private static Horse horse = new Horse("白龙马", Color.WHITE);
    private static Boat boat;
    private static Plane plane;

    // 构造器私有化
    private Factory() {
    }

    // 返回马
    public static Horse getHorse() {
        return horse;
    }

    // 返回船
    public static Boat getBoat() {
        if (boat == null) {
            boat = new Boat("独木舟");
        }
        return boat;
    }

    // 返回飞机
    public static Plane getPlane() {
        if (plane == null) {
            plane = new Plane("C919");
        }
        return plane;
    }


}
