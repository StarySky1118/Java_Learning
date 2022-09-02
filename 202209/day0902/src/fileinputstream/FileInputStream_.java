package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
        String filePath = "Z:\\hello.txt";
        readFile_Stream02(filePath);
    }

    /*
        创建文件输入流对象与filePath绑定，循环读取单个字符并输出。
    */
    public static void readFile_Stream01(String filePath) {
        FileInputStream fi = null;
        int readData = 0;

        try {
            fi = new FileInputStream(filePath);
            while((readData = fi.read()) != -1) { // 循环读取
                System.out.print((char) readData);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { // 关闭输入流
            try {
                fi.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void readFile_Stream02(String filePath) {
        FileInputStream fi = null;
        byte[] bytes = new byte[8]; // 字节数组，每次读入8个字节
        int readLen = 0;

        try {
            fi = new FileInputStream(filePath);
            while((readLen = fi.read(bytes)) != -1) { // 循环读取
                System.out.print(new String(bytes, 0, readLen));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally { // 关闭输入流
            try {
                fi.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
