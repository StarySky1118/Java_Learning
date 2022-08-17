package com.zzy.math_;

// 数学工具类
public class Utility {

    /**
     * 返回整数范围[low,high]的随机整数
     * @param low 整数下界
     * @param high 整数上界
     * @return 范围内的随机整数
     */
    /*
        基本思路 Math.random()方法生成[0,1)随机浮点数，(high + 1 - low) * Math.random()生成[low,high+1)之间
        随机浮点数，截断小数部分即可。
     */
    public static int randomInt(int low, int high) {
        // 参数校验
        if(!(low < high)) {
            throw new RuntimeException("参数不正确...");
        }

        return (int) ((high + 1 - low) * Math.random());
    }
}
