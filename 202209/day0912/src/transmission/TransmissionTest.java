package transmission;

import java.io.*;

public class TransmissionTest {
    public static void main(String[] args) {

        String srcFilePath = "Z:\\wyq.txt";
        String destFilePath = "Z:\\wyq(1).txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            String line = null;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(srcFilePath), "gbk"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFilePath), "UTF-8"));

            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("读取错误！");
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
