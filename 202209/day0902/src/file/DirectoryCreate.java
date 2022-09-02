package file;


import java.io.File;

public class DirectoryCreate {
    public static void main(String[] args) {

        String directory = "Z:\\a\\b\\c";
        File file = new File(directory);

        if(file.delete()) {
            System.out.println("文件夹" + file.getName() + "删除成功！");
        } else {
            System.out.println("文件夹" + file.getName() + "删除失败！");
        }
    }
}
