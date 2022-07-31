package com.zzy.houserent;

import java.util.Scanner;

// 房屋类
public class House {
    private String owner; // 房屋拥有者
    private String tel; // 电话
    private String address; // 地址
    private double rent; // 月租
    private boolean status; // 房屋状态

    // 构造器
    public House() {
    }

    public House(String owner, String tel, String address, double rent, boolean status) {
        this.owner = owner;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    // setter and getter
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // 输出房屋信息
    public void printInfo() {

    }

    // 房屋创建
    /*
        根据键入的房间信息创建房间对象并返回。
    * */
    public static House createHouse() {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        // 输入主人姓名
        System.out.print("主人姓名:");
        String name = scanner.next();
        house.setOwner(name);

        // 输入电话
        System.out.print("主人电话:");
        String tel = scanner.next();
        house.setTel(tel);

        // 输入地址
        System.out.print("地址:");
        String address = scanner.next();
        house.setAddress(address);

        // 输入月租
        // 循环输入直至合法
        System.out.print("月租:");
        double rent; // 月租
        do {
            rent = scanner.nextDouble();
        } while (rent <= 0);
        house.setRent(rent);

        // 输入房屋状态
        String status;
        // 循环输入直到输入y/n
        do {
            System.out.print("是否已经出租(y/n):");
            status = scanner.next();
        } while (!("y".equals(status) || "n".equals(status)));
        if ("y".equals(status)) {
            house.setStatus(true);
        } else {
            house.setStatus(false);
        }

        return house;
    }

    // 输出房屋信息
    public String houseInfo() {
        String status = this.status ? "是" : "否";
        return owner + "\t" + tel + "\t" + address + "\t" + rent + "\t\t" + status + "\n";
    }
}
