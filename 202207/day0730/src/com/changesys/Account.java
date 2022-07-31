package com.changesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 账户类
public class Account {
    // 账户余额
    private double balance;

    // 账户明细
    private String details = "";

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 收益入账
    public void income() {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.print("请输入入账金额:");
        double income_money = scanner.nextDouble();
        balance += income_money;
        details = details + "收益入账:" + income_money + " 当前余额:" + balance + " 交易时间:" + sdf.format(date) + "\n";
    }

    // 消费
    public void consume() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费金额:");
        double consume_money = scanner.nextDouble();
        if(consume_money > balance) { // 余额不足
            return;
        }
        balance -= consume_money;
        details = details + "收益入账:" + consume_money + " 当前余额:" + balance + " 交易时间:" + sdf.format(date) + "\n";
    }

    // 显示零钱通明细
    public void showDetails() {
        System.out.println("------------零钱通明细------------");
        System.out.println(details);
    }
}
