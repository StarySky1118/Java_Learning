package com.zzy.arrays02;

// 书本类
public class Book {
    private String name; // 书名
    private double price; // 价格

    // 构造器
    public Book() {
    }

    public Book(String name, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
