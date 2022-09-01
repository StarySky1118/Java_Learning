package outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_ {
    public static void main(String[] args) {


    }

    @Test
    public void write01() {
        String str = "hello, world-";
        String filePath = "Z://hello01.txt";
        // 将字符串转化为字节数组
        byte[] bytes = str.getBytes();
        FileOutputStream fileOutputStream = null;

        try {
            // 创建文件输出流对象
            fileOutputStream = new FileOutputStream(filePath, true);
            fileOutputStream.write(bytes);

            System.out.println("写入成功！");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到！");
        } catch (IOException e) {
            System.out.println("写入失败！");
        } finally { // 关闭FileOutputStream
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
