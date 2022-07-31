package com.zzy.homework06;

// 标签化坐标类
public class LabeledPoint extends Point{
    private String label; // 标签

    // 构造器
    public LabeledPoint() {
    }

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
