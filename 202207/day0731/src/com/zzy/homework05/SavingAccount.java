package com.zzy.homework05;

// 存款账户类
public class SavingAccount extends BankAccount {
    private double interestRate = 0.01; // 月利率
    private int tradeCount = 0; // 当月交易次数计数

    // 构造器
    public SavingAccount() {
    }

    public SavingAccount(double balance) {
        super(balance);
    }

    // setter and getter
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(int tradeCount) {
        this.tradeCount = tradeCount;
    }

    // 产生利息并重置当月交易次数
    public void earnMonthlyInterest() {
        // 计算当月利息并加入余额
        double monthlyInterest = getBalance() * interestRate;
        setBalance(getBalance() + monthlyInterest);

        // 重置交易次数
        tradeCount = 0;
    }

    // 存款方法
    @Override
    public void deposit(double money) {
        double serviceMoney = 1; // 手续费默认为1

        // 根据当月交易次数设置手续费
        if (tradeCount < 3) {
            serviceMoney = 0;
        }

        // 存款
        super.deposit(money - serviceMoney);
        tradeCount++;
    }

    // 取款方法
    @Override
    public void withdraw(double money) {
        double serviceMoney = 1; // 手续费默认为1

        // 根据当月交易次数设置手续费
        if (tradeCount < 3) {
            serviceMoney = 0;
        }

        // 存款
        super.withdraw(money + serviceMoney);
        tradeCount++;
    }
}

// asdljasjldjas
// asdljasjldjas
// asdljasjldjas
// asdljasjldjas