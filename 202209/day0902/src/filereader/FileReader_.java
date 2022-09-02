package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "Z:\\wyq.txt";

        readFile(filePath);
    }

    /*
        思路分析：创建FileReader对象与filePath绑定。读取到字符数组并输出。
    */
    public static void readFile(String filePath) {
        FileReader fd = null;

        try {
            char[] chars = new char[8]; // 字符数组
            int readLen = 0;

            fd = new FileReader(filePath);
            while((readLen = fd.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readLen));
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件" + filePath + "未找到！");;
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally { // 关流
            try {
                fd.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }

    }
}
