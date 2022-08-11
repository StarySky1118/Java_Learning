package com.zzy.String02;

public class String03 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";

        // 实例方法 “比较”
        //public boolean equals(Object anObject)
        System.out.println(str1.equals(str2));

        // 实例方法 “忽略大小写比较”
        // public boolean equalsIgnoreCase(String anotherString)
        System.out.println(str1.equalsIgnoreCase(str2));

        // 实例方法 “获取字符串长度”
        // public int length()
        System.out.println(str1.length());

        // 实例方法 “获取字符首次出现下标”
        // public int indexOf(int ch)
        System.out.println(str1.indexOf('e'));

        // 实例方法 “获取字符最后出现的下标”
        // public int lastIndexOf(int ch)
        System.out.println(str1.lastIndexOf('o'));

        // 实例方法 “获取子串”
        // public String substring(int beginIndex)
        System.out.println("unhappy".substring(2));
        // public String substring(int beginIndex, int endIndex)
        System.out.println("smiles".substring(1, 5));

        // 实例方法 “去除首尾空格”
        // public String trim()
        System.out.println("  hello world  ".trim());

        // 实例方法 “获取指定下标的字符”
        // public char charAt(int index)
        System.out.println("hello World".charAt(0));
    }
}
