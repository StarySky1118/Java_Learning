package com.zzy.houserentsys.domain;

/**
 *  房屋类
 * */
public class House {
    // 房主、电话、地址、月租、状态
    private String name; // 房主
    private String tel; // 电话
    private String address; // 地址
    private int rent; // 月租
    private String status; // 状态

    // 构造器

    public House(String name, String tel, String address, int rent, String status) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.rent = rent;
        this.status = status;
    }

    // setter and getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString方法
    @Override
    public String toString() {
        return  name +
                "\t\t" + tel +
                "\t\t" + address +
                "\t\t" + rent +
                "\t\t" + status;
    }
}
