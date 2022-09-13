package buffered;

import java.io.*;

public class BufferedCopy {
    public static void fileCopy(String srcFilePath, String destFilePath) {
        if(srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            String line = null;
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            // 读取与写入
            while((line = br.readLine()) != null) {
                bw.write(line);
            }

            System.out.println("文件拷贝成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关流
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
