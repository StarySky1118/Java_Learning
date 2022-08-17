package com.zzy.localdate_;

import java.time.Instant;
import java.util.Date;

// 时间戳的使用
public class InstantTest {
    public static void main(String[] args) {
        // 创建Instant对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // Instant --> Date
        Date date = Date.from(instant);

        // Date --> Instant
        Instant instant1 = date.toInstant();
    }
}
