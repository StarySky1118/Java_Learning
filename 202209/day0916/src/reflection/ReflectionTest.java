package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        String filePath = "src\\reflection\\runtime.properties";

        // 从文件中读取class和method
        Properties properties = new Properties();
        properties.load(new FileInputStream(filePath)); // 加载
        String className = properties.getProperty("class"); // 类名
        String methodName = properties.getProperty("method"); // 方法

//        System.out.println(className + methodName);

        // 加载类
        Class aClass = Class.forName(className);
        System.out.println(aClass);

        // 通过aClass得到所需类的实例
        Object o = aClass.newInstance();

        // 通过aClass得到所需类中的方法实例
        Method method = aClass.getMethod(methodName);

        // 通过方法实例调用方法
        method.invoke(o);

        // 通过aClass得到字段类实例
        Field age = aClass.getField("type");
        System.out.println(age.get(o));

        // 通过aClass得到构造器类实例
        aClass.getConstructor(String.class, int.class);

    }
}
