package com.zzy.Wrapper01;

public class Test02 {
    public static void main(String[] args) {
        // 包装类 --> String
        Integer i = 100;

        // 方式1: 字符串连接
        String str1 = i + "";

        // 方式2：使用String静态方法valueOf()，返回String对象
        String str2 = String.valueOf(i);

        // 方式3：使用Integer实例方法toString()，返回字符串
        String str3 = i.toString();

        // String --> 包装类
        String str4 = "2365";

        // 方式1：使用Integer静态方法parseInt()[分析成int]，返回int
        Integer i1 = Integer.parseInt(str4);

        // 方式2: 使用Integer构造器
        Integer i2 = new Integer(str4);
    }
}
