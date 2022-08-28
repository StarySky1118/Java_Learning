package filestarter;

import java.io.File;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        File file = new File("Z://Hello.txt");

//        try {
//            file.createNewFile();
//            System.out.println("Hello.txt 创建成功！");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 获取文件名
        // public String getName()
        System.out.println(file.getName());

        // 获取绝对路径
        // public String getAbsolutePath()
        System.out.println(file.getAbsolutePath());

        // 获取文件父级目录
        // public String getParent()
        System.out.println(file.getParent());

        // 获取文件大小（字节）
        // public long length()
        System.out.println("文件大小 = " + file.length());

        // 文件是否存在
        // public boolean exists()
        System.out.println(file.exists());

        // 判断是否为文件/目录
        // public boolean isFile/isDirectory()
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
