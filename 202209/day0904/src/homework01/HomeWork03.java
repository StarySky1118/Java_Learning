package homework01;

import java.io.*;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) {

        Properties properties = new Properties();
        String filePath = "src\\homework01\\dog.properties";
        String destFilePath = "Z:\\dog.dat";

        // 加载配置
        try {
            properties.load(new FileInputStream(filePath));
            System.out.println("配置加载成功！");
        } catch (IOException e) {
            System.out.println("文件未找到！");
        }

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(destFilePath));
            oos.writeObject(dog);
            System.out.println("对象写入成功！");
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

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(destFilePath));
            Object o = ois.readObject();
            Dog dog1 = (Dog) o;
            System.out.println(dog1.getName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("类型未找到！");
        } finally {
            // 关流
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
