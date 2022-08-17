package com.zzy.math_;

// 工具测试类
public class UtilityTest {
    public static void main(String[] args) {
        try {
            Utility.randomInt(5, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
