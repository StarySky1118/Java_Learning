package com.zzy.abstractdetails_;

// 普通员工类
public class CommonEmployee extends Employee{
    // 构造器
    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中...");
    }
}
