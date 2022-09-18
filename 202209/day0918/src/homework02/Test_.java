package homework02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取File的Class对象
        Class<?> fileClass = Class.forName("java.io.File");

        // 打印File所有构造器
        Constructor<?>[] constructors = fileClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // 创建File对象
        String filePath = "Z:\\wyqLove.txt";
        Constructor<?> constructor = fileClass.getConstructor(String.class);
        Object o = constructor.newInstance(filePath);

        // 创建文件
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(o);

        System.out.println("文件"+ o.toString() +"创建成功！");



    }
}
