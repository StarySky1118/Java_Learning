package com.zzy.Template;

public class Vip extends Template {
    private int vipLevel; // vip等级

    // 构造器
    public Vip(String name, String uid, int vipLevel) {
        super(name, uid);
        this.vipLevel = vipLevel;
    }

    // getter and setter
    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    @Override
    public void printInfo() {
        System.out.println("名字是: " + getName() + " uid事: " + getUid() + " vip等级是: " + vipLevel);
    }
}
