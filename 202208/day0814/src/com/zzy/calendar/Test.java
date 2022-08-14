package com.zzy.calendar;

import java.util.Calendar;

// 演示第二代日期类——Calendar
public class Test {
    public static void main(String[] args) {
        // 创建日历对象
        Calendar calendar = Calendar.getInstance();

        // 取出各种字段
        System.out.println("年份：" + calendar.get(Calendar.YEAR));
        System.out.println("月份：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("号  ：" + calendar.get(Calendar.DAY_OF_MONTH));
        // 没有专门格式化方法
        System.out.println(calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DAY_OF_MONTH) + " " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
    }
}
