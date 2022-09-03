package fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {
        String content = null;
        String filePath = "Z:\\hello.txt";

        writeFile(content, filePath);
    }

    /*
        创建FileOutputStream对象，将content转为字节数组并写入。
    */
    public static void writeFile(String content, String filePath) {
        FileOutputStream fileOutputStream = null;

        if(content == null) {
            throw new NullPointerException("写入字符串不能为空！");
        }

        try {
            // 字符串转换为字节数组
            byte[] bytes = content.getBytes();
            fileOutputStream = new FileOutputStream(filePath, true);

            fileOutputStream.write(bytes);

            System.out.println("写入成功！");

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("文件写入失败！");
        } finally {
            // 关流
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }
    }
}
