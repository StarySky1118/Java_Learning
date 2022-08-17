package com.zzy.bignum;

import java.math.BigDecimal;

// 演示BigDecimal的使用
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("141414.5");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
