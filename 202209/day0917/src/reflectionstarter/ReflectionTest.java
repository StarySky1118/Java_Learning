package reflectionstarter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    演示通过反射机制调用函数
 */
public class ReflectionTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 读取配置文件
        String filePath = "src\\reflectionstarter\\reflection.properties";
        Properties properties = new Properties();
        properties.load(new FileInputStream(filePath));
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

//        System.out.println(className);
//        System.out.println(methodName);

        // 利用读取到的类名创建Class对象
        Class aClass = Class.forName(className);

        // 根据aClass创建所需类的实例
        Object o = aClass.newInstance();

        // 根据aClass创建所需方法的实例
        Method jue = aClass.getMethod("jue");
        jue.setAccessible(true);
        jue.invoke(o);

        // 根据aClass创建构造器类实例
        Constructor constructor = aClass.getConstructor(String.class, int.class);
        // 使用构造器构建所需类的对象




    }
}
