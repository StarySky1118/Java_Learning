package com.zzy.enum01;

// 自定义Season枚举类
public class Season {
    private String name; // 季节名称
    private String desc; // 季节描述

    public static final Season SPRING = new Season("春天", "温暖");
    public static final Season SUMMER = new Season("夏天", "炎热");
    public static final Season AUTUMN = new Season("秋天", "凉爽");
    public static final Season WINTER = new Season("冬天", "寒冷");

    // 构造器私有化
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 只提供getter
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
