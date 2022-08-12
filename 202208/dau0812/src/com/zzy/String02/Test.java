package com.zzy.String02;

public class Test {
    public static void main(String[] args) {

        // 实例方法 “切换大小写”
        // public String toUpperCase()
        System.out.println("hello".toUpperCase());
        System.out.println("Hello".toLowerCase());

        // 实例方法 “连接”
        // public String concat(String str)
        System.out.println("go".concat("and").concat("get"));

        // 实例方法 “替换”
        // public String replace(char oldChar, char newChar)
        System.out.println("hello".replace('l', 'c'));

        // 实例方法 “分割”
        // public String[] split(String regex, int limit)
        String[] strings = "boo:and:poo".split(":", -1);
        for (String str : strings) {
            System.out.println(str);
        }
        // 特殊情况
        String str = "https:\\cn.bing.com\\";
        strings = str.split("\\\\");
        for(String s : strings) {
            System.out.println(s);
        }

        // 实例方法 “比较”
        // public int compareTo(String anotherString)
        System.out.println("hello".compareTo("Hello"));

        // 实例方法 “转换为字符数组”
        // public char[] toCharArray()
        char[] chars = "hello".toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }

        // 静态方法 “格式化”
        // 与C语言类似，有若干占位符占位符：这个位置先占着，后面再用不同变量进行填充
        String name = "蔡徐坤";
        String formatInfo = "各位全民制作人们大家好！我是个人练习生%s,喜欢唱、跳、rap、篮球,music！";
        System.out.println(String.format(formatInfo, name));


    }
}
