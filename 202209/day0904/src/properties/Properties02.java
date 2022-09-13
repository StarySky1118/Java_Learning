package properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("user", "田所浩二");
        properties.setProperty("age", "24");
        properties.setProperty("stuNo", "114514");

        try {
            properties.store(new FileOutputStream("src\\mysql2.properties"), null);
            System.out.println("保存成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
