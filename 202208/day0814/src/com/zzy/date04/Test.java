package com.zzy.date04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
        //
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate now = LocalDate.now();
        LocalDate end = LocalDate.of(2022, 12, 26);
        System.out.println("倒计时：" + now.until(end, ChronoUnit.DAYS) + "天");

    }
}
