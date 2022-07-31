package com.zzy.changesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 账户类
public class Account {
    private String name; // 姓名
    private String actNo; // 账户编号
    private double balance; // 账户余额
    private String details = ""; // 消费明细

    // 构造方法
    public Account() {
    }

    public Account(String name, String actNo, double balance) {
        this.name = name;
        this.actNo = actNo;
        this.balance = balance;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 零钱通明细显示
    public void showDetails() {
        System.out.println("-------交易明细-------");
        System.out.println(details);
    }

    // 账户余额显示
    public void showBalance() {
        System.out.println("您的账户余额为:" + balance);
    }

    // 收益入账
    public void income() {
        // 创建扫描器对象接收用户输入入账金额
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入入账金额:");
        double income_money = scanner.nextDouble();

        // 消除非法数据
        if(income_money <= 0) {
            System.out.println("金额非法，入账失败！");
            return;
        }

        // 入账并加入明细
        balance += income_money;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        details += "+" + income_money + "\t交易时间:" + sdf.format(date) + "\n";
    }

    // 消费
    public void consume() {
        // 创建扫描器对象接收用户输入消费金额
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入消费金额:");
        double consume_money = scanner.nextDouble();

        // 消除非法数据
        if(consume_money <= 0 || consume_money > balance) {
            System.out.println("金额非法，消费失败！");
            return;
        }

        // 消费并加入明细
        balance += consume_money;
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        details += "-" + consume_money + "\t交易时间:" + sdf.format(date) + "\n";
    }
}
