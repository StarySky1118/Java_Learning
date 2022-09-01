package outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String src = "Z:\\Lappland.jpg";
        String dest = "Z:\\a.jpg";
        fileCopy(src, dest);
    }

    public static void fileCopy(String src, String dest) {
        // 字节数组，一次读入8个字节
        byte[] bytes = new byte[1024];
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            // 创建输入流对象
            fileInputStream = new FileInputStream(src);
            // 创建输出流对象
            fileOutputStream = new FileOutputStream(dest, true);
            int readLen = 0;

            try {
                // 循环读取至字节数组，然后写入
                while((readLen = fileInputStream.read(bytes)) != -1) {
                    // 写入
                    fileOutputStream.write(bytes, 0, readLen);
                }
                System.out.println("文件拷贝完成！");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } finally { // 关闭输入、输出流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
