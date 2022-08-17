package com.zzy.homework02;

// 工具测试类
public class UtilityTest {
    public static void main(String[] args) {
        String str = "11451a";
        str = null;
        try {
            System.out.println(Utility.isAllDigit(str));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
