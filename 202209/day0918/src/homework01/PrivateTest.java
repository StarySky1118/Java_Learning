package homework01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // 获取Class对象
        Class<?> catClass = Class.forName("homework01.Cat");
        Object o = catClass.newInstance();

        // 获取私有属性
        Field name = catClass.getDeclaredField("name");
        name.setAccessible(true); // 暴破
        name.set(o, "田所浩二");

        // 通过公有方法获取私有属性值
        Method getName = catClass.getMethod("getName");
        System.out.println(getName.invoke(o));



    }
}
