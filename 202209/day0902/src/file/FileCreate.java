package file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

        String filePath = "Z:\\hello.txt";
        File file = new File(filePath);

        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getParent());

        System.out.println(file.length());

        System.out.println(file.exists());

        System.out.println(file.isDirectory());

        System.out.println(file.isFile());


    }

}
