package com.zzy.homework01;

public class UtilityTest {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(Utility.reverse(str, 1, 3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
