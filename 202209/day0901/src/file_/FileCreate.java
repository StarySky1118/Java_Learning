package file_;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
//        String pathName = "Z:\\黑.txt";
//        File file = new File(pathName);
//
//        try {
//            file.createNewFile();
//            System.out.println("文件创建成功！");
//        } catch (IOException e) {
//            System.out.println("文件创建失败！");
//        }

//        String parentDirectory = "Z:\\";
//        File parentFile = new File(parentDirectory);
//
//        String fileName = "锡兰.txt";
//        File file = new File(parentFile, fileName);
//
//        try {
//            file.createNewFile();
//            System.out.println("文件创建成功！");
//        } catch (IOException e) {
//            System.out.println("文件创建失败！");
//        }

        String parentDirectory = "Z:\\";
        String fileName = "煌.txt";

        File file = new File(parentDirectory, fileName);
//        try {
//            file.createNewFile();
//            System.out.println("文件创建成功！");
//        } catch (IOException e) {
//            System.out.println("文件创建失败！");
//        }

        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getParent());

        System.out.println(file.length());

        System.out.println(file.exists());

        System.out.println(file.isFile());

        System.out.println(file.isDirectory());


    }
}
