package class_;

public class Class_ {
    public static void main(String[] args) throws ClassNotFoundException {

        // 传统方式
        /*
         public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }
         */
//        Dog dog = new Dog();

        // 反射方式
        Class<?> aClass = Class.forName("class_.Dog");


    }
}
