package com.hypergraph.genericexercise01;


public class MyDate implements Comparable<MyDate> {
    private int year; // 年
    private int month; // 月
    private int day; // 日

    // 构造器
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
        return year + "-" +
                month + "-" +
                day;
    }

    @Override
    public int compareTo(MyDate date) {
        // 比较年
        int yearCmp = year - date.year;
        if (yearCmp != 0) {
            return yearCmp;
        }

        // 比较月
        int monthCmp = month - date.month;
        if (monthCmp != 0) {
            return monthCmp;
        }

        // 比较日
        return day - date.day;
    }
}
