package com.zzy.houserent;

import java.util.Scanner;

// 房屋信息表类
public class HouseInfoTable {
    private House[] houses = new House[20]; // 房屋信息表
    private int houseAmount = 0; // 房屋数量

    // 构造器
    public HouseInfoTable() {
    }

    // setter and getter
    public int getHouseAmount() {
        return houseAmount;
    }

    public void setHouseAmount(int houseAmount) {
        this.houseAmount = houseAmount;
    }

    // 新增房源
    public String Insert(House house) {
        // 房源数目有个上限
        if (houseAmount >= 20) {
            return "failure";
        }
        houses[houseAmount++] = house;
        return "success";
    }

    // 返回一个包含四项的案例
    public static HouseInfoTable houseInfoTableExample() {
        HouseInfoTable houseInfoTable = new HouseInfoTable();
        House house1 = new House("田所浩二", "114514", "下北泽", 2500, false);
        House house2 = new House("德川", "1919810", "下北泽", 3200, true);
        House house3 = new House("周撅伦", "514852", "上北泽", 2600, false);
        House house4 = new House("淳平", "15651", "下北泽", 3100, true);
        houseInfoTable.Insert(house1);
        houseInfoTable.Insert(house2);
        houseInfoTable.Insert(house3);
        houseInfoTable.Insert(house4);

        return houseInfoTable;
    }

    // 输出存储的房源信息
    public String showTable() {
        // 拼接所有房源信息
        String info = "";
        for (int i = 0; i < houseAmount; i++) {
            info += this.houses[i].houseInfo();
        }

        return info;
    }

    // 房屋查找
    // 根据用户选择的条件查找房屋
    public static String searchHouse(HouseInfoTable houseInfoTable) {
        // 用户键入查找条件
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 地  址");
        System.out.println("2 月  租");
        System.out.println("3 是 否 出 租");
        System.out.print("请输入您的查找条件(1-3):");
        int userInputNum = scanner.nextInt();

        String houses = "";
        // 根据用户键入选择分支
        switch (userInputNum) {
            case 1: // 通过地址查找
                houses = searchHouseByAddress(houseInfoTable);
                break;
            case 2:
                houses = searchHouseByRent(houseInfoTable);
                break;
            case 3:
                houses = searchHouseByStatus(houseInfoTable);
                break;
        }

        return houses;

    }

    // 通过地址查找
    // 通过用户键入的地址进行查找
    public static String searchHouseByAddress(HouseInfoTable houseInfoTable) {
        // 用户键入地址
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入地址:");
        String address = scanner.next();

        // 顺序查找
        String houses = ""; // 符合条件的房源
        for (int i = 0; i < houseInfoTable.houseAmount; i++) {
            if (address.equals(houseInfoTable.houses[i].getAddress())) { // 若地址匹配
                houses += houseInfoTable.houses[i].houseInfo();
            }
        }

        return houses;
    }

    // 根据用户键入的月租范围查找
    public static String searchHouseByRent(HouseInfoTable houseInfoTable) {
        // 用户键入月租范围
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入预期月租:");
        double floor, ceil; // 下限值、上限值
        do {
            System.out.print("下限值:");
            floor = scanner.nextDouble();
            System.out.print("上限值:");
            ceil = scanner.nextDouble();
        } while (floor <= 0 || ceil <= 0 || floor > ceil);

        // 根据月租范围查找
        String houses = ""; // 符合条件的房屋信息
        for (int i = 0; i < houseInfoTable.houseAmount; i++) {
            if (houseInfoTable.houses[i].getRent() >= floor && houseInfoTable.houses[i].getRent() <= ceil) {
                houses += houseInfoTable.houses[i].houseInfo();
            }
        }

        return houses;
    }

    // 根据是否出租进行查找
    public static String searchHouseByStatus(HouseInfoTable houseInfoTable) {
        // 用户键入是否出租信息
        Scanner scanner = new Scanner(System.in);
        String status;
        while (true) { // 循环键入直到用户输入y/n
            System.out.print("是否出租(y/n):");
            status = scanner.next();
            if ("y".equals(status) || "n".equals(status)) {
                break;
            }
        }

        // 转换成boolean类型
        boolean status_ = "y".equals(status) ? true : false;

        String houses = "";
        // 根据是否出租进行查找
        for (int i = 0; i < houseInfoTable.houseAmount; i++) {
            if (status_ == houseInfoTable.houses[i].isStatus()) {
                houses += houseInfoTable.houses[i].houseInfo();
            }
        }

        return houses;
    }

    // 房屋删除
    public String houseDelete() {
        // 提示信息
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.houseAmount; i++) { // 输出带编号的房屋信息
            System.out.print(i + "\t" + this.houses[i].houseInfo());
        }
        System.out.println("请输入要删除的房屋编号:");

        // 接收用户键入并进行合法判断
        int userInputNum = scanner.nextInt();
        if (userInputNum < 0 || userInputNum >= this.houseAmount) { // 数据非法
            return "failure";
        }

        // 删除房屋
        for (int i = userInputNum; i < houseAmount - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houseAmount--;

        return "success";
    }

    // 修改房屋信息
    // 根据用户键入选择修改房屋信息
    public String houseInfoModify() {
        // 提示信息
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.houseAmount; i++) { // 输出带编号的房屋信息
            System.out.print(i + "\t" + this.houses[i].houseInfo());
        }
        System.out.println("请输入要修改的房屋编号:");

        // 接收用户键入并进行合法判断
        int userInputNum = scanner.nextInt();
        if (userInputNum < 0 || userInputNum >= this.houseAmount) { // 数据非法
            return "failure";
        }

        // 提示用户选中房屋的信息并接收用户选择
        House house = houses[userInputNum];
        System.out.println("您选中的房屋信息如下:");
        System.out.println("1 房屋主人:" + house.getOwner());
        System.out.println("2 电    话:" + house.getTel());
        System.out.println("3 地    址:" + house.getAddress());
        System.out.println("4 月    租:" + house.getRent());
        System.out.println("5 出租状态:" + house.isStatus());
        System.out.print("请输入要修改的房屋信息:");
        userInputNum = scanner.nextInt();

        // 根据用户选择进行修改
        String userInput; // 用户键入字符串
        String modifyStatus = "success"; // 默认修改状态成功
        switch (userInputNum) {
            case 1: // 修改房屋主人
                System.out.print("请输入新的房屋主人姓名:");
                userInput = scanner.next();
                house.setOwner(userInput);
                break;
            case 2: // 修改电话
                System.out.print("请输入新的电话:");
                userInput = scanner.next();
                house.setTel(userInput);
                break;
            case 3: // 修改地址
                System.out.print("请输入新的地址:");
                userInput = scanner.next();
                house.setAddress(userInput);
                break;
            case 4: // 修改月租
                System.out.print("请输入新的租金:");
                double modifiedRent = scanner.nextDouble();
                if (modifiedRent < 0) { // 剔除非法值
                    modifyStatus = "failure";
                    break;
                }
                house.setRent(modifiedRent);
            case 5: // 修改出租状态
                System.out.print("请输入房屋出租状态(y/n):");
                userInput = scanner.next();
                if(!(userInput.equals("y") || userInput.equals("n"))) { // 房屋修改失败
                    modifyStatus = "failure";
                }
                if (userInput.equals("y")) {
                    house.setStatus(true);
                }
                if (userInput.equals("n")) {
                    house.setStatus(false);
                }
                break;
        }

        return modifyStatus;
    }
}
