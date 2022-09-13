package objectinputstream;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        Triple triple = new Triple(0, 0, 1);

        String filePath = "Z:\\date.dat";

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));
            ois = new ObjectInputStream(new FileInputStream(filePath));

            // 写入
            oos.writeObject(triple);
            System.out.println("写入成功！");

            Triple triple1 = (Triple) ois.readObject();
            System.out.println(triple1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("类未找到！");
        } finally {
            // 关流
            if(oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            if(ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
