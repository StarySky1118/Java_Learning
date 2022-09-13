package objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadObject {
    public static void main(String[] args) {
        String srcFilePath = "Z:\\date.dat";

        Object o = loadObject(srcFilePath);

        Dog dog = (Dog) o;

        System.out.println(dog.getName());
    }

    public static Object loadObject(String srcFilePath) {
        if(srcFilePath == null) {
            throw new NullPointerException("文件路径不能为空！");
        }

        ObjectInputStream ois = null;
        Object readObject = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(srcFilePath));
            readObject = ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("类未找到！");
        } finally {
            // 关流
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return readObject;
    }
}
