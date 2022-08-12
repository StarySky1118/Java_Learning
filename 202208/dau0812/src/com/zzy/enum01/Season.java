package com.zzy.enum01;

// 季节——自定义枚举类
public class Season {
    private String name; // 季节名称

    public static final Season SPRING = new Season("春天");
    public static final Season SUMMER = new Season("夏天");
    public static final Season AUTUMN = new Season("秋天");
    public static final Season WINTER = new Season("冬天");

    // 构造器私有化
    private Season(String name) {
        this.name = name;
    }

    // 只提供get方法
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
