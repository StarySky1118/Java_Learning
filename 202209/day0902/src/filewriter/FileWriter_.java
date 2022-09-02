package filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String writeContent = "德克萨斯";
        String destFilePath = "Z:\\hello.txt";
        writeFile(writeContent, destFilePath);

    }

    /*
        创建FileWriter对象并与destFilePath绑定。将writeContent写入即可。
    */
    public static void writeFile(String writeContent, String destFilePath) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(destFilePath, true);
            fw.write(writeContent);
            System.out.println("文件写入成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally { // 关闭流
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
