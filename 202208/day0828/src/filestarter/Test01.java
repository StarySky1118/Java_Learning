package filestarter;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        // 第一种方式：绝对路径创建
        // public File(String pathname)
//        File file1 = new File("Z:\\黑.txt");
//        try {
//            file1.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 第二种方式：父目录文件 + 子路径
        // public File(File parent, String child)
//        File parentFile = new File("Z:\\");
//        String path = "锡兰.txt";
//        File file = new File(parentFile, path);
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 第三种方式：父目录 + 子路径
        String parent = "Z:\\";
        String child = "鸿雪.txt";
        File file = new File(parent, child);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

