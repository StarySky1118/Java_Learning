package objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObject {
    public static void main(String[] args) {
        String destFilePath = "Z:\\date.dat";
        Dog dog = new Dog("田所浩二", 24);
        saveObject(destFilePath, dog);
    }

    public static void saveObject(String destFilePath, Object object) {
        if(destFilePath == null) {
            throw new NullPointerException("路径不能为空！");
        }

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(destFilePath));
            oos.writeObject(object);
            System.out.println(object + "保存完毕！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关流
            try {
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
