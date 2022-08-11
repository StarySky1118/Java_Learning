package com.zzy.String01;

public class Test {
    public static void main(String[] args) {
        // String类常用的构造器
        String s = "";
        char[] chars = {'1', '2', '3'};
        byte[] bytes = {1, 2, 3};

        // public String()：空构造器
        String str1 = new String();

        // public String(String original)：由现有字符串创建对象
        String str2 = new String(s);

        // public String(char value[])：由字符数组创建
        String str3 = new String(chars);

        // public String(char value[], int offset, int count)：由字符数组一部分创建
        String str4 = new String(chars, 0, 1);

        // public String(byte bytes[])：由byte数组创建
        String str5 = new String(bytes);
        System.out.println(str5);
    }
}
