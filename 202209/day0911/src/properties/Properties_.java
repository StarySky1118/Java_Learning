package properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("src\\mysql.properties"));
            System.out.println("配置加载成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        properties.list(System.out);

        properties.setProperty("stuNo", "1919810");

        try {
            properties.store(new FileOutputStream("src\\mysql.properties"), "恶臭列表");
        } catch (IOException e) {
            System.out.println("保存成功！");
        }
    }
}
