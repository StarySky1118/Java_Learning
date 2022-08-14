package com.zzy.date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        // 获取当前系统时间
        Date date = new Date(1145141919);

        // 日期格式化
        // public final String format(Date date)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm E");
        String timeString = sdf.format(date);
        System.out.println(timeString);

        // 字符串解析成Date
        String str = "1970-01-14 14:05 星期三";
        Date date1 = sdf.parse(str);
        System.out.println(sdf.format(date1));
    }
}
