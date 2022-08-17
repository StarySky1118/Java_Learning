package com.zzy.listexercise_;

// 书本类
public class Book {
    private String name; // 名称
    private double price; // 价格
    private String author; // 作者

    // 构造器
    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    // setter and getter
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return  "名称：" + name + "\t\t" +
                "价格：" + price + "\t\t" +
                "作者：" + author + "\t\t";
    }
}
