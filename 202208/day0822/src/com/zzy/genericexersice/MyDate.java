package com.zzy.genericexersice;

// 日期类
public class MyDate implements Comparable<MyDate>{
    private int year; // 年
    private int month; // 月
    private int day; // 日

    // 构造器
    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // getter and setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "year=" + year +
                ", month=" + month +
                ", day=" + day;
    }

    @Override
    public int compareTo(MyDate date) {
        // 年的比较
        int yearCmp = year - date.year;
        if(yearCmp != 0) {
            return yearCmp;
        }

        // 月的比较
        int monthCmp = month - date.month;
        if(monthCmp != 0) {
            return monthCmp;
        }

        // 日的比较
        return day - date.day;
    }
}
