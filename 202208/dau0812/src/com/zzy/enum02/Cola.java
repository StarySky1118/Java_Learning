package com.zzy.enum02;

// 可乐品牌枚举类
public enum Cola {
    PESII("百事"), COCO("可口");
    private String name; // 品牌名

    // 构造器
    Cola(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
}
