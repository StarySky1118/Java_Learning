package bufferedcopy;

import java.io.*;

public class PictureCopy {
    public static void fileCopy(String srcFilePath, String destFilePath) {
        if(srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            byte[] bytes = new byte[1024];
            int readLen = 0; // 读取字符数

            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            while((readLen = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, readLen);
            }

            System.out.println("文件拷贝成功！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("读取失败！");
        } finally {
            // 关流
            if(bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
