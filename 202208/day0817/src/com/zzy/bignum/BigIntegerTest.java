package com.zzy.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;

// BigInteger测试
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("123456789123456");
        BigInteger bigInteger2 = new BigInteger("1");

        BigDecimal bigDecimal1 = new BigDecimal("1.1919810");
        BigDecimal bigDecimal2 = new BigDecimal("0.5");

        System.out.println(bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}
