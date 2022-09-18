package reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionTest {
    public static void main(String[] args) {
        // 读取配置文件
        String filePath = "src\\reflection.properties";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

//        System.out.println(className);
//        System.out.println(methodName);

        // 生成所需类的Class对象
        Class cls = null;
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println("类未找到！");
        }
//        System.out.println(cls);

        // 使用cls生成构造器
        Constructor constructor = null;
        try {
            constructor = cls.getConstructor(String.class, int.class);
        } catch (NoSuchMethodException e) {
            System.out.println("构造器不存在！");
        }

        // 使用构造器生成所需类的对象
        Object o = null;
        try {
            o = constructor.newInstance("田所浩二", 24);
        } catch (InstantiationException e) {
            System.out.println("实例化失败！");
        } catch (IllegalAccessException e) {
            System.out.println("没有访问权限！");
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(o.getClass());

        // 生成所需方法的对象
        Method method = null;
        try {
            method = cls.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            System.out.println("方法不存在！");
        }
        try {
            method.invoke(o);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}
