package com.zzy.String02;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "wyq";
        String s3 = "hellowyq";
        String s4 = (s1 + s2).intern();
        System.out.println(s3 == s4);
    }
}
