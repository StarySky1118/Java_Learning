package com.zzy.date01;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// 第三代日期类测试类
public class Test {
    public static void main(String[] args) {
        // 创建LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();

        // 创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(dtf.format(ldt));

        // 创建时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // Instant --> Date
        Date date = Date.from(instant);

        // Date --> Instant
        Instant instant1 = date.toInstant();
    }
}
