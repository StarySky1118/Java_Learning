package com.zzy.stringbuffer01;

// 演示StringBuffer常用方法
public class Test03 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("蔡徐坤");

        // 实例方法 “增加”
//        stringBuffer.append("鸡你太美");
//        System.out.println(stringBuffer);

        // 实例方法 “删除”
//        stringBuffer.delete(0, 1);
//        System.out.println(stringBuffer);

        // 实例方法 “替换”
//        stringBuffer.replace(0, 1, "鸡你太美菜");
//        System.out.println(stringBuffer);

        // 实例方法 “查找”
//        System.out.println(stringBuffer.indexOf("徐坤"));

        // 实例方法 “插入”
//        stringBuffer.insert(1, "坤坤");
//        System.out.println(stringBuffer);

        // 实例方法 “长度”
//        System.out.println(stringBuffer.length());

        Double price = 1919810.21;
        // 转换为String
        String price_str = price.toString();

        // 转换为StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer(price_str);

        // 插入
        for (int i = stringBuffer1.indexOf(".") - 3; i > 0; i -= 3) {
            stringBuffer1.insert(i, ",");
        }

        System.out.println(stringBuffer1);
    }
}
