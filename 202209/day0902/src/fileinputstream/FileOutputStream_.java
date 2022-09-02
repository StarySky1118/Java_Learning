package fileinputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {
        String filePath = "Z:\\hello.txt";
        String content = "\nAll that I've been looking for is you!";

        writeFile_Stream(content, filePath);
    }

    /*
        创建文件输出流对象，与filePath绑定。循环输出单个字符。
    */
    public static void writeFile_Stream(String content, String filePath) {
        FileOutputStream fo = null;
        byte[] bytes = content.getBytes(); // 将字符串转换为字节数组

        try {
            fo = new FileOutputStream(filePath, true);
            fo.write(bytes);
            System.out.println("文件写入成功！");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");;
        } catch (IOException e) {
            System.out.println("文件写入失败！");
        } finally { // 关闭文件输出流
            try {
                fo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
