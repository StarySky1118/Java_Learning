package com.zzy.String01;


public class Test {
    public static void main(String[] args) {
        String str = "helloWorld";
        char[] chars = {'c', 'b', 'a'};
        byte[] bytes = {1, 2, 3};

        String str1 = new String();
        String str2 = new String(str);
        String str3 = new String(chars);
        String str4 = new String(chars, 1, 2);
        System.out.println(str4);
        String str5 = new String(bytes);
        System.out.println(str5);
    }
}
