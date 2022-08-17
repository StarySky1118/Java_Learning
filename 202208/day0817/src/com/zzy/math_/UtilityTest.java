package com.zzy.math_;

// 工具测试类
/*
    测试方案：随机生成200000个[0,100]之间的数，统计各数出现情况。
 */
public class UtilityTest {
    public static void main(String[] args) {
//        int[] count = new int[101];
//        for (int i = 0; i < count.length; i++) { // 计数器归零
//            count[i] = 0;
//        }
//
//        for (int i = 0; i < 200000; i++) {
//            count[Utility.randomInt(0, 100)]++;
//        }
//
//        for (int i = 0; i < count.length; i++) {
//            System.out.println(i + ":" + count[i]);
//        }

        try {
            int i = Utility.randomInt(1, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
