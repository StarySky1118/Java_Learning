package com.zzy.homework05;

// 账户测试类
public class AccountTest {
    public static void main(String[] args) {
//        BankAccount bankAccount = new CheckingAccount(1000);
//        bankAccount.deposit(500);
//        bankAccount.withdraw(500);
        BankAccount bankAccount = new SavingAccount(1000);
        bankAccount.deposit(500);
        bankAccount.deposit(500);
        bankAccount.withdraw(1000);
        bankAccount.withdraw(50);
        bankAccount.deposit(200);
        SavingAccount  savingAccount = (SavingAccount) bankAccount;
        savingAccount.earnMonthlyInterest();
    }
}
