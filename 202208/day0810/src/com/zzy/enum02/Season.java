package com.zzy.enum02;

// 创建Season枚举类
public enum Season {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
    private String name; // 季节名称
    private String desc; // 季节描述

    // 自动私有化构造器
    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    // 提供getter方法
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
