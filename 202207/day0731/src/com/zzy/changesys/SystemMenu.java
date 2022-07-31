package com.zzy.changesys;

import java.util.Scanner;

// 显示系统菜单
public class SystemMenu {
    public static void openMenu(Account account) {
        // 创建扫描器对象接收用户键入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true; // 是否循环显示的标志

        // 菜单循环显示
        do {
            System.out.println("-------零钱通菜单-------");
            System.out.println("       1 零钱通明细");
            System.out.println("       2 账户  余额");
            System.out.println("       3 收益  入账");
            System.out.println("       4 消     费");
            System.out.println("       5 退     出");
            System.out.print("请输入(1-5):");
            int userInputNum = scanner.nextInt(); // 接收键入

            // 根据键入值完成分支选择
            switch (userInputNum) {
                case 1 :
                    account.showDetails();
                    break;
                case 2 :
                    account.showBalance();
                    break;
                case 3 :
                    account.income();
                    break;
                case 4 :
                    account.consume();
                    break;
                case 5 :
                    loop = false;
                    break;
            }
        }while(loop);

    }
}
