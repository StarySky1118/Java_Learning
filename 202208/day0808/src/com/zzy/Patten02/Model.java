package com.zzy.Patten02;

// 模特类
public class Model {
    private String name; // 姓名
    private int age; // 年龄

    private static Model model; // 私有引用属性

    // 构造器私有化
    private Model(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 返回对象方法
    public static Model getInstance() {
        if(model==null) {
            model = new Model("杨晨晨", 25);
        }
        return model;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Model getModel() {
        return model;
    }

    public static void setModel(Model model) {
        Model.model = model;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
