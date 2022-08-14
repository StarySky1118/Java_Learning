package com.zzy.arrays02;

// 书本类
public class Book {
    private String name; // 书名
    private int price; // 价格

    // 构造器
    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  '{' +
                name + '\'' +
                ", price=" + price +
                '}';
    }
}
