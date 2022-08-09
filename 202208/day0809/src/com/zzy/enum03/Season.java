package com.zzy.enum03;

// 季节枚举类
public enum Season {
    SPRING("春天", "温暖"), SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽"), WINTER("冬天", "寒冷");
    private final String name; // 季节名称
    private final String desc; // 描述

    // 构造器私有化
    Season(String name, String desc) {
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
}
