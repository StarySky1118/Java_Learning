package com.zzy.homework05;

// 检验账户类
public class CheckingAccount extends BankAccount {
    private double serviceCharge = 1; // 手续费

    // 构造器
    public CheckingAccount() {
    }

    public CheckingAccount(double balance) {
        super(balance);
    }

    // setter and getter
    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    // 存款方法
    @Override
    public void deposit(double money) {
        super.deposit(money - serviceCharge);
    }

    // 取款方法
    @Override
    public void withdraw(double money) {
        super.withdraw(money + serviceCharge);
    }
}
