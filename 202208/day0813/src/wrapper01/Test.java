package wrapper01;

// 包装类和String的转换
public class Test {
    public static void main(String[] args) {
        // String --> 包装类
        String str = "134";
        // 方式1：使用静态方法valueOf()
        Integer integer = Integer.valueOf(str);

        // 方式2：使用构造器
        Integer integer1 = new Integer(str);

        // 包装类 --> String
        Integer integer2 = 100;
        // 方式1：调用实例方法toString()
        String str1 = integer2.toString();

        // 方式2：调用静态方法valueOf()
        String.valueOf(integer2);

        // 方式3：字符串连接
        String str3 = "" + integer2;
    }
}
