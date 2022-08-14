package com.zzy.math01;

public class Utility {

    /**
     *
     * @param a 范围下界
     * @param b 范围上界
     * @return [a,b]范围内随机整数
     */
    public static int randomInt(int a, int b) {
        // 异常值控制
        if(a > b) {
            throw new ArithmeticException();
        }
        return (int) (a + (b - a + 1) * Math.random());
    }
}
