package homework01;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) {
        /*
            思路分析：创建BufferedReader对象，使用lineNum记录读取的行数，循环：读取某行并输出。
         */

        BufferedReader br = null;
        String filePath = "Z:\\wyq.txt";

        try {
            int lineNum = 0; // 读取的行数
            String line = null; // 读取行
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
            while((line = br.readLine()) != null) {
                System.out.print((++lineNum) + " " + line);
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("读取失败！");
        } finally {
            // 关流
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
