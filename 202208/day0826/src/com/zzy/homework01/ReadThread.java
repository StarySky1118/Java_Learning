package com.zzy.homework01;

import java.util.Scanner;

// 读线程
public class ReadThread implements Runnable{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        char userInput = ' ';
        while(true) {
            System.out.print("请输入字符：");
            userInput = scanner.next().charAt(0);
            if(userInput == 'Q') {
                break;
            }
        }
    }
}
