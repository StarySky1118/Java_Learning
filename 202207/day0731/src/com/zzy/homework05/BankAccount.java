package com.zzy.homework05;

// 银行账户类
public class BankAccount {
    private double balance; // 余额

    // 构造器


    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    // setter and getter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 存款方法
    public void deposit(double money) {
        if (money <= 0) { // 非法数据
            return;
        }
        balance += money;
    }

    // 取款方法
    public void withdraw(double money) {
        if (money <= 0 || money > balance) { // 非法数据
            return;
        }
        balance -= money;
    }
}
