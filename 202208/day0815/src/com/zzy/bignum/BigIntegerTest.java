package com.zzy.bignum;

import java.math.BigInteger;

// 演示BigInteger的使用
public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("1919810114514");
        BigInteger bigInteger2 = new BigInteger("11");
//        System.out.println(bigInteger1);

        System.out.println(bigInteger1.add(bigInteger2));
        System.out.println(bigInteger1.subtract(bigInteger2));
        System.out.println(bigInteger1.multiply(bigInteger2));
        System.out.println(bigInteger1.divide(bigInteger2));
    }
}
