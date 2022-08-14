package com.zzy.bignum;

import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("191981011451451515151551");
        BigInteger bigInteger2 = new BigInteger("11");
        System.out.println(bigInteger1);

        // 加减乘除
        // public BigInteger add(BigInteger val)
//        System.out.println(bigInteger1.add(bigInteger2));
        // public BigInteger subtract(BigInteger val)
//        System.out.println(bigInteger1.subtract(bigInteger2));
        // public BigInteger multiply(BigInteger val)
//        System.out.println(bigInteger1.multiply(bigInteger2));
        // public BigInteger divide(BigInteger val)
        System.out.println(bigInteger1.divide(bigInteger2));
    }
}
