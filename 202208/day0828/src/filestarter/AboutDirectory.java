package filestarter;

import java.io.File;

public class AboutDirectory {
    public static void main(String[] args) {
//        File file = new File("Z:\\黑.txt");
//
//        if(file.exists()) {
//            // 文件的删除
//            file.delete();
//        }

        String directory = "Z://a";
        File file = new File(directory);

//        if (file.exists()) { // 目录存在
//            System.out.println("该目录已存在！");
//        } else {
//            if (file.mkdirs()) {
//                System.out.println("目录创建成功！");
//            } else {
//                System.out.println("目录创建失败！");
//            }
//        }

        if (file.exists()) { // 目录存在
            if(file.delete()) {
                System.out.println("目录删除成功！");
            } else {
                System.out.println("目录删除失败！");
            }
        } else {
            System.out.println("目录不存在！");
        }

    }

}
