package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {

        String filePath = "src//mysql.properties";

        // 1.创建Properties对象
        Properties properties = new Properties();

        // 2.加载指定配置文件
        try {
            properties.load(new FileReader(filePath));
        } catch (IOException e) {
            System.out.println("文件未找到！");
        }

        // 3.打印到控制台
        //properties.list(System.out);

        // 获取键对应的值
        System.out.println(properties.getProperty("user"));
    }
}
