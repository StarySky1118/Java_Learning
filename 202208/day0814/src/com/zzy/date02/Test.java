package com.zzy.date02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        // 创建LocalDateTime对象
        // 构造器私有化无法new
        // public static LocalDateTime now()
        // 返回表示当前时间的对象
        LocalDateTime ldt = LocalDateTime.now();

        // 创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 进行格式化
        // public String format(TemporalAccessor temporal)
        // System.out.println(dtf.format(ldt));;
        LocalDateTime localDateTime = ldt.minusYears(1);
        System.out.println(dtf.format(localDateTime));
    }
}
