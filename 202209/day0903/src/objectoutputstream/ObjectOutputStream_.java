package objectoutputstream;

import objectinputstream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectOutputStream_ {
    public static void main(String[] args) {

        ObjectInputStream ois = null;
        String filaPath = "Z:\\data.dat";

        try {
            ois = new ObjectInputStream(new FileInputStream(filaPath));

            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readUTF());

            Object o = null;
            try {
                o = ois.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            System.out.println(o);

            Dog dog = (Dog) o;
            System.out.println(dog.getName());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // 关流
            try {
                ois.close();
            } catch (IOException e) {
                System.out.println("关流失败！");
            }
        }
    }
}
