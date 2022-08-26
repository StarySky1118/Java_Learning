package com.zzy.homework01;

// 工具类
public class Utility {
    /**
     * 返回[a,b]随机整数
     * @param a 范围下界
     * @param b 范围上界
     * @return 范围内随机整数
     */
    public static int randomInt(int a, int b) {
        return (int) (a + (b - a + 1) * Math.random());
    }
}
