package com.zzy.string01;

// 演示String类常用方法
public class Test03 {
    public static void main(String[] args) {
        // 实例方法 “相等”
//        System.out.println("hello".equals("Hello"));

        // 实例方法 “忽略大小写相等”
//        System.out.println("hello".equalsIgnoreCase("Hello"));

        // 实例方法 “获取长度”
//        System.out.println("echo".length());

        // 实例方法 “获取下标”
//        System.out.println("helloWorld".indexOf("pr"));

        // 实例方法 “获取最后出现的下标”
//        System.out.println("helloWorld".lastIndexOf('o'));

        // 实例方法 “获取子串”
//        System.out.println("helloWorld".substring(1, 5));

        // 实例方法 “去除首尾空格”
//        System.out.println("  hello  ".trim());

        // 实例方法 “获取指定下标的字符”
//        System.out.println("hello".charAt(1));

        // 实例方法 “切换大小写”
//        System.out.println("this is my house".toUpperCase());
//        System.out.println("THIS IS WHAT YOU'VE BEEN LOOKING FOR...".toLowerCase());

        // 实例方法 “连接”
//        System.out.println("hello".concat("world"));

        // 实例方法 “替换”
//        System.out.println("chello".replace('c', ' '));

        // 实例方法 “分割”
//        String str = "https://www.bilibili.com/video/BV1Ht4y1g7BQ?spm_id_from=444.41.list.card_archive.click&vd_source=7a10078ee6a4ade802edf9f0f1e7ce20";
//        for(String s : str.split("&", -1)) {
//            System.out.println(s);
//        }

        // 实例方法 “比较”
//        System.out.println("hello".compareTo("he"));
//        System.out.println("hello".compareTo("hfllo"));

        // 实例方法 “转换为字符数组”
        for(char c : "hello".toCharArray()) {
            System.out.println(c);
        }
    }
}
