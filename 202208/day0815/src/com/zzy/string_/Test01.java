package com.zzy.string_;

// 演示String类常用方法
public class Test01 {
    public static void main(String[] args) {
//        System.out.println("hello".toUpperCase());
//        System.out.println("HELLO".toLowerCase());

//        System.out.println("hello".concat("World").concat("apple"));

//        System.out.println("hello".replace('l', 'f'));

//        for(String str : "https://www.bilibili.com/video/BV12a411o77f?spm_id_from=333.1007.tianma.1-2-2.click&vd_source=7a10078ee6a4ade802edf9f0f1e7ce20".split("&", -1)) {
//            System.out.println(str);

//        for(String str : "https:\\cn\\bing\\com/".split("\\\\", -1)) {
//            System.out.println(str);
//        }

//        System.out.println("hello".compareTo("hel"));
//        System.out.println("hello".compareTo("hEllo"));

//        for(char c : "hello".toCharArray()) {
//            System.out.println(c);
//        }

        String name = "田所浩二";
        int age = 24;
        String job = "学生";

        System.out.println(String.format("%s,%d岁,事%s", name, age, job));
    }
}
