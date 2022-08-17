package com.zzy.localdate_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 演示第三代日期类的使用
public class Test {
    public static void main(String[] args) {
        // 创建LocalDateTime对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 创建DateTimeFormatter对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(dtf.format(ldt));
    }
}
