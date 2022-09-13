package transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) {

        String filePath = "Z:\\wyq.txt";
        BufferedReader br = null;

        try {
            String readLine = null; // 读取整行
            br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
            while((readLine = br.readLine()) != null) {
                System.out.print(readLine);
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件读写失败！");
        } finally {
            // 关流
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
