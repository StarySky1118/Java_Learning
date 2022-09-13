package homework01;

import java.io.*;

public class Homework01 {
    public static void main(String[] args) {
        String directory = "Z:\\myTemp";
        String fileName = "hello.txt";

        File fileDirectory = new File(directory);

        // 若目录不存在，创建目录
        if (!(fileDirectory.exists())) {
            if(fileDirectory.mkdir()) {
                System.out.println("目录" + fileDirectory.getName() + "创建成功！");
            }
        }

        File file = new File(directory, fileName);

        // 创建文件
        if (file.exists()) {
            System.out.println("文件" + file.getName() + "已存在！");
        } else {
            try {
                if(file.createNewFile()) {
                    System.out.println("文件" + file.getName() + "创建成功！");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // 写入hello,world
        String str = "hello,world";
        BufferedOutputStream bos = null;

        try {
            bos = new BufferedOutputStream(new FileOutputStream(file, true));
            bos.write(str.getBytes());

            System.out.println("文件写入成功！");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("写入失败！");
        } finally {
            // 关流
            if(bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
