package com.zzy.homework01;

public class Test {
    public static void main(String[] args) {
        String str = "helloWorld";
        String str2 = "";
        System.out.println("---反转前---");
        System.out.println(str);

        try {
            str2 = Utility.reverse(str, 6, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("---反转后---");
        System.out.println(str2);
    }
}
