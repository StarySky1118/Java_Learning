package com.zzy.genericexercise02_;

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
    public int compareTo(MyDate date) {
        if(year != date.year) {
            return year - date.year;
        } else {
            if(month != date.month) {
                return month - date.month;
            } else {
                if(day != date.day) {
                    return day - date.day;
                }
            }
        }

        return 0;
    }
}
