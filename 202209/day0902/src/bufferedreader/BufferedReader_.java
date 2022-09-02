package bufferedreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) {
        String filePath = "Z:\\wyq.txt";
        readFile(filePath);
    }

    /*
        创建FileReader对象并以其为参构造BufferedReader对象，循环读取并输出。
    */
    public static void readFile(String filePath) {
        BufferedReader bufferedReader = null;

        try {
            String readString = null;
            // 创建BufferedReader对象对象
            bufferedReader = new BufferedReader(new FileReader(filePath));
            // 循环读取并输出
            while((readString = bufferedReader.readLine()) != null) {
                System.out.println(readString);
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally { // 关流
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
