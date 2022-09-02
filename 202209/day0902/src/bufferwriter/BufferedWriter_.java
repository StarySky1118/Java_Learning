package bufferwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) {
        String writeContent = "Hello,girl!";
        String filePath = "Z:\\wyq.txt";

        writeFile(writeContent, filePath);
    }

    /*
        实现思路：创建FileWriter对象并以其为参构造BufferedWriter对象，将writeContent写入。
    */
    public static void writeFile(String writeContent, String filePath) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            bufferedWriter.write(writeContent);
            System.out.println("写入成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // 关流
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
