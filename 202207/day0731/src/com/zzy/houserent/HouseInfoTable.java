package com.zzy.houserent;

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
        if(houseAmount >= 20) {
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
}
