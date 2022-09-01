package file_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void read01() {
        String filePath = "Z:\\hello.txt"; // 文件路径
        int read = 0;
        FileInputStream fileInputStream = null;

        // 创建FileInputStream对象
        try {
            fileInputStream = new FileInputStream(filePath);

            // 循环读取文件
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 关闭FileInputStream
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void read02() {
        String filePath = "Z:\\hello.txt"; // 文件路径
        byte[] bytes = new byte[8]; // 字节数组
        FileInputStream fileInputStream = null;

        // 创建FileInputStream对象
        try {
            fileInputStream = new FileInputStream(filePath);

            // 循环读取文件
            while (true) {
                // 读取字节到字节数组
                int readLen = fileInputStream.read(bytes);
                if(readLen <= 0) { // 读取完毕
                    break;
                }
                for (int i = 0; i < readLen; i++) {
                    System.out.print((char) bytes[i]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 关闭FileInputStream
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
