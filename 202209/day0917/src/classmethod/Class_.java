package classmethod;

import java.lang.reflect.Field;

public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        String classPath = "classmethod.Homo";
        Class<?> aClass = Class.forName(classPath);

        // public String toString()
        // 接口/类 + 全类名
        System.out.println(aClass);

        // 通过Class对象创建类对象
        Object o = aClass.newInstance();

        // 得到包名
        System.out.println(aClass.getPackage().getName());

        // 得到全类名
        System.out.println(aClass.getName());

        // 通过反射获取属性、修改属性
        // 无法访问私有属性
        System.out.println(aClass.getField("name").get(o));
        aClass.getField("name").set(o, "德川");
        System.out.println(aClass.getField("name").get(o));

        // 获取所有字段
        Field[] fields = aClass.getFields();
        for(Field filed : fields) {
            System.out.println(filed.getName());
        }

    }
}
