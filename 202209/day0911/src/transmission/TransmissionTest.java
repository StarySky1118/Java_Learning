package transmission;

import java.io.*;

public class TransmissionTest {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\wyq.txt";
        String destFilePath = "Z:\\wyq(1).txt";

        fileCopy(srcFilePath, destFilePath);

    }

    public static void fileCopy(String srcFilePath, String destFilePath) {
        if(srcFilePath == null || destFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            String line = null;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(srcFilePath), "gbk"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFilePath), "gbk"));

            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("文件拷贝成功！");
        } catch (UnsupportedEncodingException e) {
            System.out.println("编码方式错误！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读取失败！");
        } finally {
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
