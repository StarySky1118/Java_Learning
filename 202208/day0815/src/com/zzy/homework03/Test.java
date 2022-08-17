package com.zzy.homework03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //String name = "Kevin Wayne Durant";
//        try {
//            System.out.println(Utility.nameFormatter());;
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入人名：");
        String name = scanner.next();
        System.out.println(name);
//        for(String str : name.split(" ")) {
//            System.out.println(str);
//        }
    }
}
