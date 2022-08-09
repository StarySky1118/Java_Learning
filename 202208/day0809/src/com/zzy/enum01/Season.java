package com.zzy.enum01;

public class Season {
    private String name; // 季节名称
    private String desc; // 描述

    // 在类的内部提供引用
    private static Season spring; // 春天
    private static Season summer; // 夏天
    private static Season autumn; // 秋天
    private static Season winter; // 冬天

    // 构造器私有化
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    // 返回实例方法
    public static Season getSpring() {
        if(spring==null) {
            spring = new Season("春天", "温暖");
        }
        return spring;
    }

    public static Season getSummer() {
        if(summer==null) {
            summer = new Season("夏天", "炎热");
        }
        return summer;
    }

    public static Season getAutumn() {
        if(autumn==null) {
            autumn = new Season("秋天", "凉爽");
        }
        return autumn;
    }

    public static Season getWinter() {
        if(winter==null) {
            winter = new Season("冬天", "寒冷");
        }
        return winter;
    }
}
