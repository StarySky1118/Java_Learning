package com.zzy.date03;

import java.time.Instant;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // 创建Instant对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // Instant --> Date
        // public static Date from(Instant instant)
        Date date = Date.from(instant);

        // Date --> Instant
        Instant instant1 = date.toInstant();
    }
}
