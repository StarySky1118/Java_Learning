package api01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class api_ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {
        Class<?> personClass = Class.forName("api01.Person");

        // 获取简单类名
//        System.out.println(personClass.getSimpleName());
//
        // 获取public字段，包括本类和父类所有public字段
//        Field[] fields = personClass.getFields();
//        for(Field field : fields) {
//            System.out.println(field.getName());
//        }

        // 获取所有字段
//        Field[] declaredFields = personClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }

        // 获取所有public方法
//        Method[] methods = personClass.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//        }

        // 获取本类所有方法
//        Method[] declaredMethods = personClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod.getName());
//        }
        // 构造器也是类似

        // 获取包名
//        System.out.println(personClass.getPackage().getName());

        // 得到父类的Class对象
//        Class<?> superclass = personClass.getSuperclass();
//        System.out.println(superclass.getSimpleName());

        // 获取实现的接口
//        Class<?>[] interfaces = personClass.getInterfaces();
//        for (Class<?> anInterface : interfaces) {
//            System.out.println(anInterface.getSimpleName());
//        }

        // 获取注解
//        Annotation[] annotations = personClass.getAnnotations();
//        Field name = personClass.getField("name");
//
//        // 获取修饰符
//        System.out.println(name.getModifiers());
//
//        // 获取该属性类型
//        System.out.println(name.getType());


        Method m1 = personClass.getMethod("m1");
        // 获取返回值类型
        Class<?> returnType = m1.getReturnType();
        System.out.println(returnType.getName());

        // 返回参数列表
        Class<?>[] parameterTypes = m1.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);

        }



    }
}
