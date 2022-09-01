package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "Z:\\黑.txt";
        readTxt(filePath);
    }

    public static void readTxt(String filePath) {
        char[] chars = new char[8];
        FileReader fr = null;

        try {
            int readLen = 0;
            fr = new FileReader(filePath);
            // 读取到字符数组
            while((readLen = fr.read(chars)) != -1) {
                String str = new String(chars, 0, readLen);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally {
            // 关闭FileReader
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
