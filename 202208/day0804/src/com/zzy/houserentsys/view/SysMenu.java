package com.zzy.houserentsys.view;

import com.zzy.houserentsys.domain.House;
import com.zzy.houserentsys.service.HouseService;
import com.zzy.houserentsys.utils.Utility;

/**
 * 系统菜单类
 */
public class SysMenu {
    public static void mainMenu(HouseService houseService) {
        char choice; // 用户键入选择
        boolean loop = true; // 是否循环的标志

        do {
            // 输出菜单显示信息
            System.out.println("-------------欢迎使用房屋出租系统-------------");
            System.out.println("            1 新 增 房 源");
            System.out.println("            2 查 找 房 屋");
            System.out.println("            3 删 除 房 屋 信 息");
            System.out.println("            4 修 改 房 屋 信 息");
            System.out.println("            5 房 屋 列 表");
            System.out.println("            6 退 出 系 统");
            System.out.print("请输入您的选择(1-6): ");

            // 接收用户键入
            choice = Utility.readMenuSelection();

            // 根据用户键入完成逻辑
            switch (choice) {
                case '1':
                    addHouse(houseService);
                    break;
                case '2':
                    searchHouses(houseService);
                    break;
                case '3':
                    delHouses(houseService);
                    break;
                case '4':
                    modifyHouses(houseService);
                    break;
                case '5':
                    listHouses(houseService);
                    break;
                case '6':
                    // 退出前需进行确认
                    loop = exit();
                    break;
            }

        } while (loop);
    }

    // 房屋列表显示
    public static void listHouses(HouseService houseService) {
        // 接收房屋列表
        House[] houses = houseService.list();

        // 菜单显示
        System.out.println("-------------房 屋 列 表-------------");
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        for (int i = 0; i < houseService.getHouse_num(); i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.println(houses[i].toString());
        }
        System.out.println("-------------房 屋 列 表 显 示 完 毕-------------\n");
    }

    // 新增房屋
    public static void addHouse(HouseService houseService) {
        // 接收房屋信息
        System.out.println("-------------请输入房屋信息-------------");
        System.out.print("房主: ");
        String name = Utility.readString(20, "无名氏");
        System.out.print("电话: ");
        String tel = Utility.readString(20, "88888888");
        System.out.print("地址: ");
        String address = Utility.readString(100, "中国");
        System.out.print("月租: ");
        int rent = Utility.readInt(1000);
        System.out.print("状态: ");
        String status = Utility.readString(3, "未出租");

        // 房屋添加
        String addStatus = houseService.add(name, tel, address, rent, status);

        // 新增提示信息
        if ("success".equals(addStatus)) {
            System.out.println("房屋新增成功！");
        } else {
            System.out.println("房屋新增失败！请联系管理员增大存储空间！");
        }
    }

    // 房屋删除
    public static void delHouses(HouseService houseService) {
        // 显示房屋列表
        listHouses(houseService);

        // 接收要删除的房屋编号
        System.out.print("请输入要删除的房屋编号: ");
        int houseId = Utility.readInt();

        // 房屋删除确认信息
        char delConfirm = Utility.readConfirmSelection();
        if ('N' == delConfirm) {
            return;
        }

        // 屏蔽非法值
        if (houseId < 1 || houseId > houseService.getHouse_num()) {
            System.out.print("非法房屋编号！删除失败！");
            return;
        }

        // 房屋删除
        houseService.del(houseId);
        System.out.println("房屋删除成功！");
    }

    // 退出
    public static boolean exit() {
        char quitConfirm = Utility.readConfirmSelection();
        return 'y' == quitConfirm;
    }

    /**
     * 打印所有可供修改/删除的属性
     */
    public static void printProperties() {
        System.out.println("\n1 姓 名");
        System.out.println("2 电 话");
        System.out.println("3 地 址");
        System.out.println("4 月 租");
        System.out.println("5 状 态");
        System.out.println("6 退 出");
    }

    // 查找房屋信息
    public static void searchHouses(HouseService houseService) {
        System.out.println("-------------房屋查找-------------");

        // 提示用户输入选择
        System.out.print("请输入筛选条件(1-5):");
        printProperties();
        char choice = Utility.readMenuSelection();

        // 根据选择完成逻辑
        switch (choice) {
            case '1': // 根据姓名查找
                searchHousesByName(houseService);
                break;
            case '2': // 根据电话查找
                searchHousesByTel(houseService);
                break;
            case '3': // 根据地址查找
                searchHousesByAddress(houseService);
                break;
            case '4': // 根据月租查找
                searchHousesByRent(houseService);
                break;
            case '5': // 根据状态查找
                searchHousesByStatus(houseService);
                break;
            default:
                break;
        }
    }

    /**
     * 打印抬头
     */
    public static void printTile() {
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
    }

    public static void searchHousesByName(HouseService houseService) {
        // 读取姓名
        System.out.print("请输入姓名: ");
        String name = Utility.readString(20, "无名氏");

        // 查找
        System.out.println("符合条件的房屋如下: ");
        printTile();
        houseService.searchByName(name);
        System.out.println("-------------查找完毕-------------");
    }

    public static void searchHousesByTel(HouseService houseService) {
        // 读取电话
        System.out.print("请输入电话: ");
        String tel = Utility.readString(20, "88888888");

        // 查找
        System.out.println("符合条件的房屋如下: ");
        printTile();
        houseService.searchByTel(tel);
        System.out.println("-------------查找完毕-------------");
    }

    public static void searchHousesByAddress(HouseService houseService) {
        // 读取地址
        System.out.print("请输入地址: ");
        String address = Utility.readString(100, "中国");

        // 查找
        System.out.println("符合条件的房屋如下: ");
        printTile();
        houseService.searchByAddress(address);
        System.out.println("-------------查找完毕-------------");
    }

    public static void searchHousesByStatus(HouseService houseService) {
        // 读取状态
        System.out.print("请输入状态: ");
        String status = Utility.readString(3, "未出租");

        // 查找
        System.out.println("符合条件的房屋如下: ");
        printTile();
        houseService.searchByStatus(status);
        System.out.println("-------------查找完毕-------------");
    }

    public static void searchHousesByRent(HouseService houseService) {
        // 读取月租
        int low; // 月租下限
        int high; // 月租上限
        boolean loop = true; // 是否循环键入的标志
        do {
            System.out.print("请输入月租下限值: ");
            low = Utility.readInt();
            System.out.print("请输入月租上限值: ");
            high = Utility.readInt();
            if (low <= high && low > 0) {
                loop = false;
            }
        } while (loop);

        // 根据月租进行查找
        System.out.println("符合条件的房屋如下: ");
        printTile();
        houseService.searchByRent(low, high);
        System.out.println("-------------查找完毕-------------");
    }

    // 修改房屋信息
    public static void modifyHouses(HouseService houseService) {
        System.out.println("-------------房屋信息修改-------------");
        // 选择修改的房屋
        listHouses(houseService); // 显示房屋列表
        System.out.print("请选择要修改的房屋编号: ");
        int houseId = Utility.readInt();

        // 屏蔽非法值
        if (houseId < 1 || houseId > houseService.getHouse_num()) {
            System.out.println("非法房屋编号！修改失败！");
            return;
        }

        // 提示用户输入选择
        System.out.print("请输入修改属性(1-5):");
        printProperties();
        char choice = Utility.readMenuSelection();

        // 根据选择完成逻辑
        switch (choice) {
            case '1': // 修改姓名
                modifyHouseName(houseService, houseId);
                break;
            case '2': // 修改电话
                modifyHouseTel(houseService, houseId);
                break;
            case '3': // 修改地址
                modifyHouseAddress(houseService, houseId);
                break;
            case '4': // 修改月租
                modifyHouseRent(houseService, houseId);
                break;
            case '5': // 修改状态
                modifyHouseStatus(houseService, houseId);
                break;
            default:
                break;
        }
    }

    /**
     * 输出修改成功消息
     */
    public static void printModifySuccess() {
        System.out.println("-------------修改成功-------------");
    }

    /**
     * @param houseService 修改的房屋列表
     * @param houseId      房屋编号
     * 修改房屋列表中某个编号房屋的主人姓名
     */
    public static void modifyHouseName(HouseService houseService, int houseId) {
        // 读取姓名
        System.out.print("请输入姓名: ");
        String name = Utility.readString(20, "无名氏");

        // 修改姓名
        houseService.modifyHouseName(houseId, name);
        printModifySuccess();
    }

    /**
     * @param houseService 修改的房屋列表
     * @param houseId      房屋编号
     * 修改房屋列表中某个编号房屋的主人电话
     */
    public static void modifyHouseTel(HouseService houseService, int houseId) {
        // 读取电话
        System.out.print("请输入电话: ");
        String tel = Utility.readString(20, "88888888");

        // 修改电话
        houseService.modifyHouseTel(houseId, tel);
        printModifySuccess();
    }

    /**
     * @param houseService 修改的房屋列表
     * @param houseId      房屋编号
     * 修改房屋列表中某个编号房屋的地址
     */
    public static void modifyHouseAddress(HouseService houseService, int houseId) {
        // 读取地址
        System.out.print("请输入地址: ");
        String address = Utility.readString(100, "中国");

        // 修改地址
        houseService.modifyHouseAddress(houseId, address);
        printModifySuccess();
    }

    /**
     * @param houseService 修改的房屋列表
     * @param houseId      房屋编号
     * 修改房屋列表中某个编号房屋的月租
     */
    public static void modifyHouseRent(HouseService houseService, int houseId) {
        // 读取月租
        System.out.print("请输入月租: ");
        int rent = Utility.readInt();
        while (rent <= 0) {
            System.out.print("请重新输入月租: ");
            rent = Utility.readInt();
        }

        // 修改月租
        houseService.modifyHouseRent(houseId, rent);
        printModifySuccess();
    }

    /**
     * @param houseService 修改的房屋列表
     * @param houseId      房屋编号
     * 修改房屋列表中某个编号房屋的状态
     */
    public static void modifyHouseStatus(HouseService houseService, int houseId) {
        // 读取状态
        System.out.print("请输入状态: ");
        String status = Utility.readString(3, "未出租");

        // 修改状态
        houseService.modifyHouseStatus(houseId, status);
        printModifySuccess();
    }
}
