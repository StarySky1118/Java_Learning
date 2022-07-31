package com.zzy.houserent;

import java.util.Scanner;

// 系统菜单类
public class SysMenu {
    // 引入房屋信息表启动菜单
    public static void openMenu(HouseInfoTable houseInfoTable) {
        boolean loop = true; // 是否进行循环的标志

        // 循环显示菜单
        do {
            System.out.println("------------房屋出租系统------------");
            System.out.println("          1 新 增 房 源");
            System.out.println("          2 查 找 房 屋");
            System.out.println("          3 删 除 房 屋");
            System.out.println("          4 修 改 房 屋 信 息");
            System.out.println("          5 房 屋 列 表");
            System.out.println("          6 退       出");

            // 接收用户键入
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入您的操作(1-6):");
            int userInputNum = scanner.nextInt();

            // 根据用户键入完成逻辑
            switch (userInputNum) {
                case 1 : // 新 增 房 源
                    String insertStatus = houseInfoTable.Insert(House.createHouse());
                    // 判断房屋是否新增成功
                    if("success".equals(insertStatus)) {
                        System.out.println("房屋新增成功！");
                    } else {
                        System.out.println("房屋新增失败！");
                    }
                    break;
                case 2 : // 查找房屋
                    break;
                case 3:
                    break;
                case 4 :
                    break;
                case 5 : // 房屋列表
                    System.out.println("------------房屋列表------------");
                    System.out.println("姓名\t电话\t地址\t月租\t是否已出租");
                    System.out.println(houseInfoTable.showTable());
                    break;
                case 6 :
                    loop = false;
                    System.out.println("退出成功！");
                    break;
            }
        }while(loop);
    }
}
