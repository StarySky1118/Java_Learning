package com.zzy.houserentsys.service;

import com.zzy.houserentsys.domain.House;

/***
 * 系统业务类
 */
public class HouseService {
    private final int size = 5; // 可存放的最大房屋数目
    private final House[] houses = new House[size]; // 房屋列表，最多存储10个房屋
    private int house_num = 0; // 房屋数量

    // setter and getter
    public int getHouse_num() {
        return house_num;
    }

    // 返回房屋列表
    public House[] list() {
        return houses;
    }

    // 房屋添加
    public String add(String name, String tel, String address, int rent, String status) {
        // 创建房屋对象
        House house = new House(name, tel, address, rent, status);

        // 将房屋对象添加到数组
        if (house_num >= size) { // 数组已满
            return "failure";
        }
        houses[house_num++] = house;
        return "success";
    }

    // 房屋删除
    public void del(int houseId) {
        for (int i = houseId - 1; i < house_num - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--house_num] = null;
    }

    /**
     * 通过名字查找直接输出符合条件的房屋信息
     * @param name 查找的名字
     */
    public void searchByName(String name) {
        // 输出房屋个数
        int count = 0;

        // 输出符合条件的房屋信息
        for (int i = 0; i < house_num; i++) {
            if (houses[i].getName().equals(name)) {
                System.out.print((++count) + "\t\t");
                System.out.println(houses[i].toString());
            }
        }
    }

    /**
     * 通过电话查找直接输出符合条件的房屋信息
     * @param tel 查找的电话
     */
    public void searchByTel(String tel) {
        // 输出房屋个数
        int count = 0;

        // 输出符合条件的房屋信息
        for (int i = 0; i < house_num; i++) {
            if (houses[i].getTel().equals(tel)) {
                System.out.print((++count) + "\t\t");
                System.out.println(houses[i].toString());
            }
        }
    }

    /**
     * 通过地址查找直接输出符合条件的房屋信息
     * @param address 查找的地址
     */
    public void searchByAddress(String address) {
        // 输出房屋个数
        int count = 0;

        // 输出符合条件的房屋信息
        for (int i = 0; i < house_num; i++) {
            if (houses[i].getAddress().equals(address)) {
                System.out.print((++count) + "\t\t");
                System.out.println(houses[i].toString());
            }
        }
    }

    /**
     * 通过状态查找直接输出符合条件的房屋信息
     * @param status 查找的地址
     */
    public void searchByStatus(String status) {
        // 输出房屋个数
        int count = 0;

        // 输出符合条件的房屋信息
        for (int i = 0; i < house_num; i++) {
            if (houses[i].getStatus().equals(status)) {
                System.out.print((++count) + "\t\t");
                System.out.println(houses[i].toString());
            }
        }
    }

    /**
     * 通过月租查找直接输出符合条件的房屋信息
     * @param low  月租下限
     * @param high 月租上限
     */
    public void searchByRent(int low, int high) {
        // 输出房屋个数
        int count = 0;

        // 输出符合条件的房屋信息
        for (int i = 0; i < house_num; i++) {
            if (houses[i].getRent() >= low && houses[i].getRent() <= high) {
                System.out.print((++count) + "\t\t");
                System.out.println(houses[i].toString());
            }
        }
    }

    /**
     * 修改指定房屋的主人姓名
     * @param houseId 房屋编号
     * @param name 新的房屋主人名字
     */
    public void modifyHouseName(int houseId, String name) {
        houses[houseId-1].setName(name);
    }

    /**
     * 修改指定房屋的主人电话
     * @param houseId 房屋编号
     * @param tel 新的房屋主人电话
     */
    public void modifyHouseTel(int houseId, String tel) {
        houses[houseId-1].setTel(tel);
    }

    /**
     * 修改指定房屋的地址
     * @param houseId 房屋编号
     * @param address 新的房屋地址
     */
    public void modifyHouseAddress(int houseId, String address) {
        houses[houseId-1].setAddress(address);
    }

    /**
     * 修改指定房屋的月租
     * @param houseId 房屋编号
     * @param rent 新的房屋月租
     */
    public void modifyHouseRent(int houseId, int rent) {
        houses[houseId-1].setRent(rent);
    }

    /**
     * 修改指定房屋的状态
     * @param houseId 房屋编号
     * @param status 新的房屋状态
     */
    public void modifyHouseStatus(int houseId, String status) {
        houses[houseId-1].setStatus(status);
    }


    // 为对象引入案例值
    public void example() {
        houses[0] = new House("田所浩二", "114514", "下北泽", 2000, "未出租");
        houses[1] = new House("德川", "1919810", "东京湾", 3200, "已出租");
        houses[2] = new House("我修院", "161514", "上北泽", 2200, "未出租");
        houses[3] = new House("周撅伦", "1145514", "下北泽", 2100, "已出租");
        house_num += 4;
    }
}
