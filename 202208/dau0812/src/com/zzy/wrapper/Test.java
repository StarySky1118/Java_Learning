package com.zzy.wrapper;


public class Test {
    public static void main(String[] args) {
        // 手动装箱
//        Integer i = Integer.valueOf(100);
//
//        // 手动拆箱
//        int i1 = i.intValue();
//
//        // String --> Wrapper
//        String str = "1234";
//
//        // 1、使用构造器
//        Integer i2 = new Integer(str);
//
//        // 2、使用静态方法parseInt()
//        Integer i3 = Integer.parseInt(str);
//
//        // Wrapper --> String
//        Integer i4 = 1234;
//
//        // 1、使用静态方法toString()
//        String str2 = i4.toString();
//
//        // 2、字符串连接
//        String str3 = i4 + "";
//
//        // 3、String构造方法
//        String str4 = String.valueOf(i4);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.toUpperCase('c'));
    }
}
