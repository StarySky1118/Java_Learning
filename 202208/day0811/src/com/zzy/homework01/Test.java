package com.zzy.homework01;

public class Test {
    public static void main(String[] args) {

        try {
            // 验证参数个数是否为2
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            // 进行转换
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[1]);

            // 计算
            double res = cal(dividend, divisor);

            System.out.println("res = " + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("转换异常");
        } catch (ArithmeticException e) {
            System.out.println("除0异常");
        }
    }

    public static double cal(int dividend, int divisor) {
        return dividend / divisor;
    }
}
