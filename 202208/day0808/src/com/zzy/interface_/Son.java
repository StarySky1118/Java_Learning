package com.zzy.interface_;

public class Son extends Peasant implements Internet{
    public Son(String name, String id) {
        super(name, id);
    }

    @Override
    public void programming() {
        System.out.println(getName() + "大学期间学会了java编程");
    }

    @Override
    public void farming() {
        System.out.println(getName() + "从父亲那里学会了种地");
    }
}
