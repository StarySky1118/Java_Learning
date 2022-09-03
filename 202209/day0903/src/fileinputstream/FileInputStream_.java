package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
        String filePath = "Z:\\hello.txt";
        readFile(filePath);
    }

    /*
        创建FileInputStream对象，循环读取字节到字节数组并输出。
    */
    public static void readFile(String filePath) {
        FileInputStream fileInputStream = null;

        try {
            byte[] buf = new byte[8]; // 8字节数组
            int readLen = 0;
            fileInputStream = new FileInputStream(filePath);

            // 循环读取输出
            while((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally {
            // 关流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }
    }
}
