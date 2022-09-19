package homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取 File 的 Class 对象
        Class<?> fileClass = Class.forName("java.io.File");

        // 获取 File 所有构造器
        Constructor<?>[] constructors = fileClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // 获取 File 特定构造器
        String filePath = "Z:\\GlassWalls.txt";
        Constructor<?> constructor = fileClass.getConstructor(String.class);
        Object o = constructor.newInstance(filePath);

        // 获取 createNewFile() 方法实例
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);
        System.out.println("文件创建成功！");



    }
}
