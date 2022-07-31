package com.changesys;
// 菜单
public class SysMenu {
    public static void menuOpen() { // 开启菜单方法
        java.util.Scanner  scanner = new java.util.Scanner(System.in);

        Account zzy = new Account(3000);
        // 菜单界面
        System.out.println("------------零钱通菜单------------");
        System.out.println("         1 零钱通明细");
        System.out.println("         2 收益入账");
        System.out.println("         3 消费");
        System.out.println("         4 退出");

        int flag  = 0; // 循环结束标志
        while(true) {
            System.out.print("请选择(1-4):");
            int useInputNum = scanner.nextInt();
            switch (useInputNum) {
                case 1 :
                    zzy.showDetails();
                    break;
                case 2 :
                    zzy.income();
                    break;
                case 3 :
                    zzy.consume();
                    break;
                case 4 :
                    flag = 1;
                    break;
            }
            if(flag == 1) {
                break;
            } // if
        }


    }
}
