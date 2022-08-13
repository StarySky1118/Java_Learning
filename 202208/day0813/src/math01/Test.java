package math01;

public class Test {
    public static void main(String[] args) {
        // 静态方法 “绝对值”
        // public static int abs(int a)
        System.out.println(Math.abs(-1));

        // 静态方法 “求幂”
        // public static double pow(double a, double b)
        // 返回a的b次方
        System.out.println(Math.pow(2, 3));

        // 静态方法 “向上取整”
        // public static double ceil(double a)
        System.out.println(Math.ceil(2.3));

        // 静态方法 “向下取整”
        // public static double floor(double a)
        System.out.println(Math.floor(2.3));

        // 静态方法 “四舍五入”
        // public static long round(double a)
        System.out.println(Math.round(2.5));

        // 静态方法 “开方”
        // public static double sqrt(double a)
        System.out.println(Math.sqrt(4));

        // 静态方法 “随机数”
        // public static double random()
        // 产生[0.0, 1.0)之间的随机数
        System.out.println(Math.random());

        // 静态方法 “较大值/较小值”
        // public static int max(int a, int b)
        System.out.println(Math.max(3, 4));
    }
}
