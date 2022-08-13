package wrapper;

// 装箱与拆箱
public class Test {
    public static void main(String[] args) {
        // 手动装箱
        int i = 100;
        // valueOf()静态方法：返回值为...的...类型对象。
        Integer integer = Integer.valueOf(i);

        // 手动拆箱
        // intValue()实例方法：返回Integer类型实例的int值
        int i1 = integer.intValue();

        // 自动装箱
        Integer integer1 = 100;

        // 自动拆箱
        int i2 = integer1;

        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);

    }
}
