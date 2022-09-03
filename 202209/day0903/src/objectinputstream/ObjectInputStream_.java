package objectinputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) {
        String filePath = "Z:\\data.dat";

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(100);
            oos.writeBoolean(true);
            oos.writeUTF("斯人若彩虹，遇见方知有。");

            oos.writeObject(new Dog("田所浩二", 24));

            System.out.println("文件写入完成(序列化形式)");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关流
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
