package com.zzy.stringbuffer_;

// 演示StringBuffer常用方法
public class StringBufferTest02 {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("蔡徐坤");
//        sb.append("鸡你太美");
//        System.out.println(sb);

//        sb.delete(3, sb.length());
//        System.out.println(sb);

//        sb.replace(5, 6, "太太");
//        System.out.println(sb);

//        System.out.println(sb.indexOf("鸡"));

//        sb.insert(sb.indexOf("太"), "太");
//        System.out.println(sb);

        /*
            基本思路 首先进行转换：double --> Double --> String --> StringBuilder，
            循环，“.”字符前每隔三位加一个“,”。
         */
        double price = 1919810.22;
        // 转换为StringBuilder
        Double price_Double = price;
        String price_String = price_Double.toString();
        StringBuilder price_StringBuilder = new StringBuilder();
        price_StringBuilder.append(price_String);

        // 循环添加“,”
        for (int i = price_StringBuilder.indexOf(".") - 3; i > 0 ; i -= 3) {
            price_StringBuilder.insert(i, ",");
        }

        System.out.println(price_StringBuilder);


    }
}
