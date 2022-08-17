package com.zzy.math_;

// 工具类
public class Utility {
    /**
     * 返回[low,high]范围内的随机整数
     *
     * @param low  范围下界
     * @param high 范围上界
     * @return [low, high]范围内的随机整数
     */
    public static int randomInt(int low, int high) {
        // 参数校验
        if (low >= high) {
            throw new RuntimeException("参数不正确！");
        }

        return (int) ((high - low + 1) * Math.random());
    }
}
