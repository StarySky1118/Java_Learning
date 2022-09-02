package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\Lappland.jpg";
        String destFilePath = "Z:\\bb.jpg";

        fileCopy(srcFilePath, destFilePath);

    }

    /*
        思路分析：创建文件输入流与srcFilePath绑定，创建文件输出流与destFilePath绑定。读取时，将字节读入
        大小为1024的字节数组并记录读入大小，输出时，将字节数组指定部分输出。
    */
    public static void fileCopy(String srcFilePath, String destFilePath) {
        FileInputStream fi = null;
        FileOutputStream fo = null;

        try {
            byte[] bytes = new byte[1024]; // 字节数组
            int readLen = 0; // 读取字节数

            // 创建输入输出流
            fi = new FileInputStream(srcFilePath);
            fo = new FileOutputStream(destFilePath);

            while((readLen = fi.read(bytes)) != -1) { // 循环读取、写入
                fo.write(bytes, 0, readLen);
            }
            System.out.println("文件拷贝成功！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally { // 关流
            try {
                fi.close();
                fo.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }
    }
}
