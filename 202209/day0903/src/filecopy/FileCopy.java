package filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\Lappland.jpg";
        String destFilePath = "Z:\\Lappland(1).jpg";

        copyFile(srcFilePath, destFilePath);
    }

    /*
        实现思路：创建FileInputStream和FileOutputStream对象，循环：将读取的字节存入大小为1024的字节数组，
        再将读取到的字节写入文件。
    */
    public static void copyFile(String srcFilePath, String destFilePath) {
        if(srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            byte[] buf = new byte[1024]; // 缓冲字节数组
            int readLen = 0; // 读取字节数
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            // 循环读取与写入
            while ((readLen = fileInputStream.read(buf)) != -1) {
                fileOutputStream.write(buf, 0, readLen);
            }

            System.out.println("文件拷贝完成！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读写失败！");
        } finally {
            // 关流
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


