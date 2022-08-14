package com.zzy.bignum;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 =new BigDecimal("1.1919810114514789456123");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal1);

        // 加减乘除
//        System.out.println(bigDecimal1.add(bigDecimal2));
//        System.out.println(bigDecimal1.subtract(bigDecimal2));
//        System.out.println(bigDecimal1.multiply(bigDecimal2));
        // 除法除不尽时可能抛出异常，需要指定精度。使用以下代码保留被除数精度。
        System.out.println(bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
