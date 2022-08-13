package exception02;

import java.util.Scanner;

// 工具类
public class Utility {
    public static Scanner scanner = new Scanner(System.in); // 扫描器

    // 读取整数
    public static int readInt() {
        boolean loop = true;
        String userInputStr; // 用户键入字符串
        int userInputNum = 0; // 用户键入整数

        do {
            System.out.print("请输入整数: ");
            userInputStr = scanner.next();

            try { // 尝试进行转换
                userInputNum = Integer.parseInt(userInputStr);
                loop = false;
            } catch (NumberFormatException e) {
                System.out.println("您输入的不是一个整数...");
            }

        }while(loop);

        return userInputNum;
    }
}
