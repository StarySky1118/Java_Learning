package com.zzy.string01;

// 演示String的构造器
public class Test01 {
    public static void main(String[] args) {
        String string = "helloWorld";
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        byte[] bytes = {97, 97, 98};

        // 空构造器
//        String str = new String();

        // 由现有字符串构建
//        String str = new String(string);

        // 由字符数组构建
//        String str = new String(chars);

        // 由字符数组一部分构建
//        String str = new String(chars, 1, 4);
//        System.out.println(str);

        // 由byte数组构建
        String str = new String(bytes);
        System.out.println(str);
    }
}
