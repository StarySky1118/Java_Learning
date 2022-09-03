package bufferedinputstream;

import java.io.*;

public class BufferedInputStream_ {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\Lappland.jpg";
        String destFilePath = "Z:\\Lappland(2).jpg";

        fileCopy(srcFilePath, destFilePath);
    }

    public static void fileCopy(String srcFilePath, String destFilePath) {
        if (srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            byte[] buf = new byte[1024]; // 字节缓冲数组
            int readLen = 0;
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath, true));

            while((readLen = bufferedInputStream.read(buf)) != -1) {
                bufferedOutputStream.write(buf, 0, readLen);
            }

            System.out.println("拷贝完成！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读写失败！");
        } finally {
            // 关流
            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }

                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
