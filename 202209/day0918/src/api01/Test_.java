package api01;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_ {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> cls = Class.forName("api01.Person");

        Object o = cls.newInstance();
//
//        Method m4 = cls.getDeclaredMethod("m4");
//        m4.setAccessible(true);
//        m4.invoke(o);

        Field n1 = cls.getDeclaredField("n1");
        n1.setAccessible(true);
        n1.set(null, 300);
        n1.get(null);

    }
}
