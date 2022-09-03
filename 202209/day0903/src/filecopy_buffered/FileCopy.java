package filecopy_buffered;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\wyq.txt";
        String destFilePath = "Z:\\wyq(1).txt";
        fileCopy(srcFilePath, destFilePath);
    }

    /*
        实现思路：创建BufferedReader和BufferedWriter，循环：读取并写入。
    */
    public static void fileCopy(String srcFilePath, String destFilePath) {
        if (srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            String readLine = null;
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath, true));

            // 循环读取、写入
            while ((readLine = br.readLine()) != null) {
                bw.write(readLine);
                bw.newLine();
            }

            System.out.println("拷贝成功！");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关流
            try {
                if(br != null) {
                    br.close();
                }

                if(bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }
    }
}
