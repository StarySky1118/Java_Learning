package filecopy;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\Lappland.jpg";
        String destFilePath = "Z:\\Lappland(1).jpg";

        copyFile(srcFilePath, destFilePath);
    }

    /*
        思路分析：创建BufferedInputStream和BufferedOutputStream对象。循环：读取到字节数组中并输出。
    */
    public static void copyFile(String srcFilePath, String destFilePath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            byte[] bytes = new byte[1024];
            int readLen = 0; // 读取字节数
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
            while((readLen = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readLen);
            }

            System.out.println("文件拷贝成功！");

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读写失败！");
        } finally {
            // 关流
            try {
                bis.close();
                bos.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }

    }
}
