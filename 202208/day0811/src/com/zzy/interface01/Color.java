package com.zzy.interface01;

// 颜色枚举类
public enum Color {
    RED("红色"), GREEN("绿色"), GREY("灰色"), WHITE("白色");
    private String name; // 颜色名称

    // 构造器
    Color(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }

}
