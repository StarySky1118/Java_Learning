package file;

import java.io.File;

public class FileDelete {
    public static void main(String[] args) {

        String filePath = "Z:\\hello01.txt";
        File file = new File(filePath);

        if(file.exists()) {
            file.delete();
            System.out.println("文件删除成功！");
        } else {
            System.out.println("文件不存在！");
        }
    }
}
